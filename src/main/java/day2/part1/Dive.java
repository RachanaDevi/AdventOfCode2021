package day2.part1;

import java.util.List;

import static day2.part1.Constants.*;

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

    public Integer depthHorizontalProduct() {
        if (commands.isEmpty()) return 0;

        if (!(commands.hasDepthDirections() && commands.hasForwardDirection())) return 0;

        var directionSumMap = commands.directionSumMap();

        int depthUnit = directionSumMap.getOrDefault(DOWN_COMMAND, 0) + directionSumMap.getOrDefault(UP_COMMAND, 0) * -1;
        int horizontalUnit = directionSumMap.get(FORWARD_COMMAND);
        return depthUnit * horizontalUnit;
    }

    void addCommands(List<String> commands) {
        for (String entry : commands) {
            String[] directionUnitSplit = entry.split(" ");
            add(directionUnitSplit[0], Integer.parseInt(directionUnitSplit[1]));
        }
    }
}

