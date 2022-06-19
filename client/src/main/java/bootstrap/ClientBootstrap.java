package bootstrap;

import config.ClientConfig;
import io.netty.bootstrap.Bootstrap;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.SneakyThrows;



import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ClientBootstrap extends Bootstrap
{

    @Getter(AccessLevel.PROTECTED)
    private ClientConfig config;


    @SneakyThrows
    protected void init()
    {
        final Path localStorage = Paths.get(config.getLocalStorage());
        if (!Files.exists(localStorage)) Files.createDirectories(localStorage);
    }
}
