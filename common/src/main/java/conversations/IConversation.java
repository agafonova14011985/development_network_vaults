package conversations;

import messages.IMessage;
import org.jetbrains.annotations.NotNull;
import transport.ITransportChannel;

public interface IConversation
{
    @NotNull
    String getId();

    void setId(@NotNull String id);

    @NotNull
    IConversationManager getConversationManager();

    void setConversationManager(@NotNull IConversationManager conversationManager);

    void processMessage(@NotNull IMessage message, @NotNull ITransportChannel transportChannel);
}
