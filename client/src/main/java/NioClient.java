
import conversations.ClientConversationManager;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import messages.IMessage;
import transport.INetworkEndpoint;
import transport.ITransportChannel;
import transport.NioTransportChannel;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;


public class NioClient implements INetworkEndpoint
{
    //private static final


    @Getter
    @Setter
    private ClientConversationManager conversationManager;

    @Getter
    private final ITransportChannel transportChannel;



    private final Selector selector;

    private final Thread pingWorker;

    @SneakyThrows
    public NioClient(ITransportChannel transportChannel, Thread pingWorker) {
        this.transportChannel = transportChannel;
        this.pingWorker = pingWorker;
        selector = Selector.open();
        final SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost", 9999));
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_READ);
        final NioTransportChannel channel;///////////////
//
        //
        //
        //
    }

    @Override
    @SneakyThrows
    public void start()
    {
        pingWorker.start();
        while (transportChannel.isConnected())
        {
            selector.select();
            if (!selector.isOpen()) break;
            for(final SelectionKey selectionKey : selector.selectedKeys())
            {
                if (selectionKey.isReadable())
                {
                    try
                    {
                        final IMessage
                                message = transportChannel.readMessage();
                       //
                        //
                    }
                    catch (final ITransportChannel.CorruptedDataReceived e)
                    { //ignore

                    }
                    catch (Exception e)
                    {
                        transportChannel.closeSilently();
                        break;
                    }
                }
            }
            selector.selectedKeys().clear();
        }
    }

    @Override
    @SneakyThrows
    public void stop()
    {
        pingWorker.interrupt();
        if (selector.isOpen()) selector.close();
        transportChannel.closeSilently();
    }
}