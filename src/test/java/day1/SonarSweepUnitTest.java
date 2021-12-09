package day1;

import org.junit.jupiter.api.Test;
import util.FileReader;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SonarSweepUnitTest {

    @Test
    void shouldReturnIncreasedAsZeroIfThereAreNoEntries() {
        List<String> sonarEntries = Collections.emptyList();
        SonarSweep sonarSweep = new SonarSweep(sonarEntries);

        int measurements = sonarSweep.increasedMeasurements();

        assertEquals(0, measurements);
    }

    @Test
    void shouldReturnIncreasedAsZeroIfEntryIsOne() {
        List<String> sonarEntries = List.of("100");
        SonarSweep sonarSweep = new SonarSweep(sonarEntries);

        int measurements = sonarSweep.increasedMeasurements();

        assertEquals(0, measurements);
    }

    @Test
    void shouldReturnIncreasedEntryAsOneGivenTwoEntriesAndAnEntryIncreases() {
        List<String> sonarEntries = List.of("100", "102");
        SonarSweep sonarSweep = new SonarSweep(sonarEntries);

        int measurements = sonarSweep.increasedMeasurements();

        assertEquals(1, measurements);
    }

    @Test
    void shouldReturnIncreasedEntries() {
        List<String> sonarEntries = List.of("100", "102", "103", "100");
        SonarSweep sonarSweep = new SonarSweep(sonarEntries);

        int measurements = sonarSweep.increasedMeasurements();

        assertEquals(2, measurements);
    }

    @Test
    void shouldReturnIncreasedEntriesInSmallSample() throws IOException {
        List<String> sonarEntries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day1/small_sample");
        SonarSweep sonarSweep = new SonarSweep(sonarEntries);

        int measurements = sonarSweep.increasedMeasurements();

        assertEquals(7, measurements);
    }

    @Test
    void shouldReturnIncreasedEntriesInPuzzleInput() throws IOException {
        List<String> sonarEntries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day1/part1_puzzle_input.txt");
        SonarSweep sonarSweep = new SonarSweep(sonarEntries);

        int measurements = sonarSweep.increasedMeasurements();

        assertEquals(1754, measurements);
    }
}