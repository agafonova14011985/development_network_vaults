package conversations;

import lombok.Getter;
import lombok.Setter;
import messages.IMessage;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public abstract class AbstractConversation implements IConversation
{
    @Getter
    @Setter
    private String id = UUID.randomUUID().toString();

    @Getter
    @Setter
    private IConversationManager conversationManager;

    private Set<Class<? extends IMessage>> expectedMessages = new LinkedHashSet<>();

    protected void expectMessage(final @NotNull Class<? extends IMessage> messageClass)
    {
        expectedMessages.add(messageClass);
    }

    protected void stopExpectingMessage(final @NotNull Class<? extends IMessage> messageClass)
    {
        expectedMessages.remove(messageClass);
    }


}
