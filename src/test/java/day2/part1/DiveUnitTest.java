package day2.part1;

import org.junit.jupiter.api.Test;
import util.FileReader;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DiveUnitTest {

    @Test
    void shouldReturnZeroIfThereAreNoCommands() {
        Dive dive = new Dive();

        assertThat(dive.depthHorizontalProduct()).isZero();
    }

    @Test
    void shouldReturnDepthPositionProductAsZeroWhenNoDepthCommandHasBeenGiven() {
        Dive dive = new Dive();
        dive.add("forward", 5);

        assertThat(dive.depthHorizontalProduct()).isZero();
    }

    @Test
    void shouldReturnDepthPositionProductAsZeroWhenNoForwardCommandHasBeenGiven() {
        Dive dive = new Dive();
        dive.add("down", 5);

        assertThat(dive.depthHorizontalProduct()).isZero();
    }

    @Test
    void shouldReturnDepthPositionProductGivenTwoCommands() {
        Dive dive = new Dive();
        dive.add("forward", 3);
        dive.add("down", 10);
        dive.add("up", 2);
        dive.add("forward", 10);

        assertThat(dive.depthHorizontalProduct()).isEqualTo(104);
    }

    @Test
    void shouldReturnDepthHorizontalProductForSampleFile() throws IOException {
        List<String> entries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day2/sample.txt");
        Dive dive = new Dive();
        dive.addCommands(entries);

        assertThat(dive.depthHorizontalProduct()).isEqualTo(150);
    }

    @Test
    void shouldReturnDepthHorizontalProductForPuzzleInput() throws IOException {
        List<String> entries = FileReader.entriesIn("/Users/rachanadevi/Coding/AdventOfCode_2021/src/test/java/day2/part1/part1_puzzle_input.txt");
        Dive dive = new Dive();
        dive.addCommands(entries);

        assertThat(dive.depthHorizontalProduct()).isEqualTo(1924923);
    }
}