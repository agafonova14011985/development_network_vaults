package conversations;

import config.ClientConfig;
import messages.IMessage;
import org.jetbrains.annotations.NotNull;
import transport.ITransportChannel;


public class AuthenticationClientAgent extends AbstractConversation
{

    private ClientConfig config;


    //private Event<EAuthFailure> authFailureBus;


    //private Event<EAuthSuccess> authSuccessBus;

    @Override
    public synchronized void start()
    {

    }

    @Override
    public synchronized void processMessageFromPeer(@NotNull IMessage message)
    {
        //

        getConversationManager().stopConversation(this);
    }

    @Override
    public void stop() {

    }

    @Override
    public void processMessage(@NotNull IMessage message, @NotNull ITransportChannel transportChannel) {

    }
}
