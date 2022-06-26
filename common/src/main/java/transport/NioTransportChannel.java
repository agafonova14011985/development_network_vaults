package transport;

import lombok.SneakyThrows;
import messages.IMessage;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;


public class NioTransportChannel implements ITransportChannel
{
    private static final int READ_BUFFER_CAPACITY = 256;


    @Override
    public void sendMessage(@NotNull IMessage message) {

    }

    @Override
    public @NotNull IMessage readMessage() throws CorruptedDataReceived, RemoteEndGone {
        return null;
    }

    @Override
    public void closeSilently() {

    }

    @Override
    public String getRemoteAddress() {
        return null;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public void close() throws IOException {

    }
}