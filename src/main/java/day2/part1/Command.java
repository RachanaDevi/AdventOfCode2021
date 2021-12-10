package day2.part1;

public class Command {
    private final String direction;
    private final Integer unit;

    public Command(String direction, Integer unit) {
        this.direction = direction;
        this.unit = unit;
    }

    public String direction() {
        return direction;
    }

    public Integer unit() {
        return unit;
    }
}
