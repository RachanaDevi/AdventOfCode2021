package day2.part1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiveUnitTest {

    @Test
    void shouldReturnZeroIfThereAreNoCommands() {
        Dive dive = new Dive();

        assertThat(dive.depthPositionProduct()).isZero();
    }

    @Test
    void shouldReturnDepthPositionProductAsZeroWhenNoDepthCommandHasBeenGiven() {
        Dive dive = new Dive();
        dive.add("forward", 5);

        assertThat(dive.depthPositionProduct()).isZero();
    }

    @Test
    void shouldReturnDepthPositionProductAsZeroWhenNoForwardCommandHasBeenGiven() {
        Dive dive = new Dive();
        dive.add("down", 5);

        assertThat(dive.depthPositionProduct()).isZero();
    }

    @Test
    @Disabled
    void shouldReturnDepthPositionProductGivenTwoCommands() {
        Dive dive = new Dive();
        dive.add("down", 5);
        dive.add("forward", 5);

        assertThat(dive.depthPositionProduct()).isEqualTo(25);
    }
}