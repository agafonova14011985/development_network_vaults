package context;

import conversations.IConversationManager;
import org.jetbrains.annotations.NotNull;
import transport.ITransportChannel;

public interface IClientContext
{
    @NotNull
    ITransportChannel getTransportChannel();

    void setTransportChannel(@NotNull ITransportChannel transportChannel);

    @NotNull
    IConversationManager getConversationManager();

    void setConversationManager(@NotNull IConversationManager conversationManager);

    boolean isAuthenticated();

    void setAuthenticated(boolean value);
}