package lesson_1.server;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import lesson_1.common.exception.PathDoesNotExistException;
import lesson_1.common.exception.PathIsNotADirectoryException;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public class ServerDirectory
{
    @Getter
    private Path rootDirectory;

    @Getter
    private Path currentDirectory;

    public static class AbsolutePathException extends Exception {}

    public void setRootDirectory(final @NotNull Path rootDirectory)
    {
        this.rootDirectory = rootDirectory;
        this.currentDirectory = rootDirectory;
    }

    public void cd(final @NotNull Path path) throws PathDoesNotExistException,
            PathIsNotADirectoryException
    {
        final Path newPath = currentDirectory.resolve(path).normalize();
        if (!newPath.startsWith(rootDirectory))
        {
            currentDirectory = rootDirectory;
        }
        if (!Files.exists(newPath)) throw new PathDoesNotExistException();
        if (!Files.isDirectory(newPath)) throw new PathIsNotADirectoryException();
        currentDirectory = newPath;
    }

    public void cd(final @NotNull String path) throws AbsolutePathException,
            PathIsNotADirectoryException,
            PathDoesNotExistException
    {
        final Path newPath = Paths.get(path);
        if (newPath.isAbsolute()) throw new AbsolutePathException();
        cd(newPath);
    }

   /* public String pwd()
    {
        return rootDirectory.relativize(currentDirectory).toString();
    }

    */
}