package conversations;



public class PingWorker extends Thread
{
    private static final int PING_PERIOD = 1000;


    private ClientConversationManager conversationManager;

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(PING_PERIOD);
                if (!conversationManager.getTransportChannel().isConnected()) continue;
                conversationManager.startConversation(KeepAliveClientAgent.class);
            }
            catch (InterruptedException e)
            {
                break;
            }
        }
    }
}
