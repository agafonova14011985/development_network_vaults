package conversations;

import messages.IMessage;
import messages.KeepAliveMessage;
import org.jetbrains.annotations.NotNull;

import transport.ITransportChannel;

public class KeepAliveClientAgent extends AbstractClientAgent
{
    private long startTime;

    @Override
    public void processMessage(final @NotNull IMessage message,
                               final @NotNull ITransportChannel transportChannel)
    {
        final long delta = System.currentTimeMillis() - startTime;
        System.out.println("Response from " +
                transportChannel.getRemoteAddress() +
                ". rtt=" +
                delta +
                "ms");
        getConversationManager().stopConversation(this);
    }

    @Override
    public synchronized void start()
    {
        startTime = System.currentTimeMillis();
        expectMessage(KeepAliveMessage.class);
        sendMessageToPeer(new KeepAliveMessage());
    }

    @Override
    public void processMessageFromPeer(@NotNull IMessage message) {

    }

    @Override
    public void stop() {

    }

    private void sendMessageToPeer(KeepAliveMessage keepAliveMessage) {
    }
}