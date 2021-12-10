package day1.part2;

import org.junit.jupiter.api.Test;
import util.FileReader;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SonarSweepUnitTest {

    @Test
    void shouldReturnIncreasedMeasurementsAsZeroIfEntriesAreLessThanFour() {
        SonarSweep sonarSweep = new SonarSweep(List.of("1", "2", "3"));
        int increasedMeasurements = sonarSweep.increasedMeasurements();

        assertThat(increasedMeasurements).isEqualTo(0);
    }

    @Test
    void shouldReturnIncreasedMeasurementsAsOneIfGivenFourEntriesAndSumIncreases() {
        SonarSweep sonarSweep = new SonarSweep(List.of("1", "2", "3", "4"));
        int increasedMeasurements = sonarSweep.increasedMeasurements();

        assertThat(increasedMeasurements).isEqualTo(1);
    }

    @Test
    void shouldReturnIncreasedMeasurementsAsZeroIfGivenFourEntriesAndSumDecreases() {
        SonarSweep sonarSweep = new SonarSweep(List.of("1", "2", "3", "0"));
        int increasedMeasurements = sonarSweep.increasedMeasurements();

        assertThat(increasedMeasurements).isEqualTo(0);
    }

    @Test
    void shouldReturnIncreasedMeasurementsAsFiveForSmallSample() throws IOException {
        List<String> entries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day1/small_sample");
        SonarSweep sonarSweep = new SonarSweep(entries);

        int increasedMeasurements = sonarSweep.increasedMeasurements();

        assertThat(increasedMeasurements).isEqualTo(5);
    }

    @Test
    void shouldReturnIncreasedEntriesInPuzzleInput() throws IOException {
        List<String> sonarEntries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day1/part2/part2_puzzle_input.txt");
        SonarSweep sonarSweep = new SonarSweep(sonarEntries);

        int increasedMeasurements = sonarSweep.increasedMeasurements();

        assertThat(increasedMeasurements).isEqualTo(1789);
    }

    @Test
    void shouldReturnSumOfFirstThreeElements() {
        SonarSweep sonarSweep = new SonarSweep(List.of("1", "1", "1"));
        int sumOfFirstThreeElements = sonarSweep.sumOfThreeElements(0);

        assertThat(sumOfFirstThreeElements).isEqualTo(3);
    }
}
