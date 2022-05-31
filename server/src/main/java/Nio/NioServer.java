package Nio;

import transport.INetworkEndpoint;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;


public class NioServer implements INetworkEndpoint
{
    private Selector selector;

    private ServerSocketChannel socketChannel;


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
