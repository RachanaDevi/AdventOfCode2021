package day2.part1;

/*

Commands:
forward 1, -> horizontal position increases
down 2, -> increases depth
up 3 -> decreased depth


forward 5
down 5
forward 8
up 3
down 8
forward 2


starts from 0
5 horizontal
5 depth
8+5 = 13 horizontal
3 up means 2 depth
down 8 means 10 depth
forward 2 means
13+2 = 15

So at the end you multiply 15*10=150
 */
public class Dive {

    private Commands commands = new Commands();

    public Dive() {
    }

    public void add(String direction, Integer unit) {
        commands.add(direction, unit);
    }

    public Integer depthPositionProduct() {
        if (commands.isEmpty()) return 0;

        if (!(commands.hasDepthDirections() && commands.hasForwardDirection())) return 0;

        var directionSumMap = commands.directionSumMap();
        return null;

    }
}

