package day2.part1;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class CommandsUnitTest {

    @Test
    void shouldReturnSizeOfCommandsWhenAnEntryHasBeenAdded() {
        var commands = new Commands();
        commands.add("forward", 10);

        assertThat(commands.size()).isOne();
    }

    @Test
    void shouldReturnFalseIfNoDepthDirectionIsPresent() {
        var commands = new Commands();
        commands.add("forward", 10);
        var depthDirectionPresent = commands.hasDepthDirections();

        assertThat(depthDirectionPresent).isFalse();
    }

    @Test
    void shouldReturnTrueIfADepthDirectionIsPresent() {
        var commands = new Commands();
        commands.add("down", 10);
        var directionPresent = commands.hasDepthDirections();

        assertThat(directionPresent).isTrue();
    }

    @Test
    void shouldReturnFalseIfNoForwardDirectionIsPresent() {
        var commands = new Commands();
        commands.add("down", 10);
        var depthDirectionPresent = commands.hasForwardDirection();

        assertThat(depthDirectionPresent).isFalse();
    }

    @Test
    void shouldReturnTrueIfForwardDirectionIsPresent() {
        var commands = new Commands();
        commands.add("forward", 10);
        var directionPresent = commands.hasForwardDirection();

        assertThat(directionPresent).isTrue();
    }

    @Test
    void shouldReturnTrueIfThereAreNoCommands() {
        var commands = new Commands();

        assertThat(commands.isEmpty()).isTrue();
    }

    @Test
    void shouldReturnDirectionUnitSumMap() {
        Commands commands = new Commands();

        commands.add("down", 5);
        commands.add("forward", 10);
        commands.add("up", 20);
        commands.add("down", 6);
        commands.add("forward", 7);
        commands.add("up", 9);

        assertThat(commands.directionSumMap()).isEqualTo(Map.of("down", 11, "forward", 17, "up", 29));
    }

}