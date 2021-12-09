package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public final class FileReader {

    public static List<String> entriesIn(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }
}
