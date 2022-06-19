package conversations;

import lombok.Getter;
import lombok.Setter;
import messages.IMessage;
import org.jetbrains.annotations.NotNull;
import transport.ITransportChannel;


public class LsClientAgent extends AbstractConversation
{
    @Getter
    @Setter
    private String requestedPath;



    @Override
    public void processMessageFromPeer(@NotNull IMessage message)
    {
        }


    @Override
    public void start()
    {
        setTimeoutMillis(60000);
       // expectMessage(LsResponse.class);
        //

    }

    private void setTimeoutMillis(int i) {
    }

    @Override
    public void stop()
    {
//
    }

    @Override
    public void processMessage(@NotNull IMessage message, @NotNull ITransportChannel transportChannel) {

    }
}