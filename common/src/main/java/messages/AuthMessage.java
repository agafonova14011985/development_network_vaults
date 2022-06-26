package messages;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthMessage extends AbstractMessage
{
    private String login;

    private String passwordHash;
}