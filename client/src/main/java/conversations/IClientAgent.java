package conversations;
import org.jetbrains.annotations.NotNull;

import transport.ITransportChannel;

public interface IClientAgent extends IConversation
{
    @NotNull ITransportChannel getTransportChannel();

    void setTransportChannel(@NotNull ITransportChannel transportChannel);

    void start();
}
