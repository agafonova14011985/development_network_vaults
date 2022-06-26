package handlers;



import conversations.IConversationManager;
import events.EMessageReceived;
import messages.IMessage;
import transport.ITransportChannel;




public class HMessageReceived
{
    private void handle(
                        final EMessageReceived event)
    {
        final IConversationManager conversationManager = event.getConversationManager();
        final IMessage message = event.getMessage();
        final ITransportChannel transportChannel = event.getTransportChannel();
        conversationManager.dispatchMessage(message, transportChannel);
    }
}