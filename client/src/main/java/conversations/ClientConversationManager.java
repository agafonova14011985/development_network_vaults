package conversations;

import org.jetbrains.annotations.NotNull;


public class ClientConversationManager extends AbstractConversationManager
{
    public void startConversation(final @NotNull IClientAgent conversation)
    {
        conversation.setConversationManager(this);
        conversationMap.put(conversation.getId(), conversation);
        conversation.start();
    }
}