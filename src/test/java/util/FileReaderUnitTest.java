package util;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileReaderUnitTest {

    @Test
    void shouldReturnTenElementsSeparatedByNewLinesInAFile() throws IOException {
        List<String> fileEntries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day1/small_sample");

        assertEquals(10, fileEntries.size());
    }

    @Test
    void shouldReturnElementsSeparatedByNewLinesInAFile() throws IOException {
        List<String> fileEntries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day1/small_sample");

        assertEquals(List.of("199", "200", "208", "210", "200", "207", "240", "269", "260", "263"),
                fileEntries);
    }
}