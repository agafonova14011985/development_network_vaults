package messages;

import java.awt.*;

public class KeepAliveMessage extends AbstractMessage
{
    public KeepAliveMessage()
    {
        setType(MessageType.KEEP_ALIVE);
    }
}