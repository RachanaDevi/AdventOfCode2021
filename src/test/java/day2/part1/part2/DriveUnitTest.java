package day2.part1.part2;

import day2.part2.Dive;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DriveUnitTest {

    @Test
    void shouldHaveForwardAndDepth() {
        Dive dive = new Dive();
        dive.add("down",10);
        dive.add("forward",3);

        assertThat(dive.depth()).
    }
}
