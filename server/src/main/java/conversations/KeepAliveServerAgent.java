package conversations;

import messages.IMessage;
import messages.KeepAliveMessage;
import org.jetbrains.annotations.NotNull;
import transport.ITransportChannel;

public class KeepAliveServerAgent extends AbstractConversation
{
    public KeepAliveServerAgent()
    {
        expectMessage(KeepAliveMessage.class);
    }

    @Override
    public void processMessage(final @NotNull IMessage message,
                               final @NotNull ITransportChannel transportChannel)
    {
        if (message instanceof KeepAliveMessage)
        {
            System.out.println("Ping request received from " + transportChannel.getRemoteAddress());

            final IMessage outgoingMessage = new KeepAliveMessage();
            outgoingMessage.setConversationId(getId());
            transportChannel.sendMessage(outgoingMessage);
            getConversationManager().stopConversation(this);
        }
    }
}