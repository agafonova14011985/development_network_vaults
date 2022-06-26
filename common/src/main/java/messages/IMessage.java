package messages;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.Serializable;

public interface IMessage extends Serializable
{
    @NotNull
    String getId();

    @NotNull
    String getConversationId();

    void setConversationId(@NotNull String conversationId);

    @NotNull
    MessageType getType();

    void setType(@NotNull MessageType type);
}