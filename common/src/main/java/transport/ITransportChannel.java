package transport;

import messages.IMessage;
import org.jetbrains.annotations.NotNull;

import java.io.Closeable;

public interface ITransportChannel extends Closeable
{
    void sendMessage(@NotNull IMessage message);

    @NotNull
    IMessage readMessage() throws CorruptedDataReceived, RemoteEndGone;

    void closeSilently();

    String getRemoteAddress();

    boolean isConnected();

    class CorruptedDataReceived extends Exception {}

    class RemoteEndGone extends Exception {}
}