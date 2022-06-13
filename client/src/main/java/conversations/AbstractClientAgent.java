package conversations;

import lombok.Getter;
import lombok.Setter;
import transport.ITransportChannel;


public abstract class AbstractClientAgent extends AbstractConversation implements IClientAgent
{
    @Getter
    @Setter
    private ITransportChannel transportChannel;
}