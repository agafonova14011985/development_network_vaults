package lesson_1.client.comand;

import lesson_1.common.exception.PathDoesNotExistException;
import lesson_1.common.exception.PathIsNotADirectoryException;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Command {



    @Getter
    private Path currentDirectory;

    public synchronized void cd(final @NotNull String path) throws PathDoesNotExistException, PathIsNotADirectoryException
    {
        if (path.length() == 0) return;
        Path newPath = Paths.get(path).normalize();
        if (!newPath.isAbsolute()) newPath = currentDirectory.resolve(newPath);
        if (!Files.exists(newPath)) throw new PathDoesNotExistException();
        if (!Files.isDirectory(newPath)) throw new PathIsNotADirectoryException();
        currentDirectory = newPath.normalize();
    }



}
