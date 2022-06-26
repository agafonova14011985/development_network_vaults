package conversations;

import messages.IMessage;
import org.jetbrains.annotations.NotNull;
import transport.ITransportChannel;

public interface IConversationManager
{
    void dispatchMessage(@NotNull IMessage message, @NotNull ITransportChannel transportChannel);

    void stopConversation(@NotNull IConversation conversation);
}