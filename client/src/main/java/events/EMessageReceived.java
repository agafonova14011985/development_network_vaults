package events;

import conversations.IConversationManager;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import messages.IMessage;

import transport.ITransportChannel;

@Getter
@Setter
@AllArgsConstructor
public class EMessageReceived
{
    private IConversationManager conversationManager;

    private IMessage message;

    private ITransportChannel transportChannel;
}