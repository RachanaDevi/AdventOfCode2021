package day2.part2;

import java.util.List;

import static day2.part1.Constants.*;

/*

Commands:
forward 1, -> horizontal position increases
down 2, -> increases depth
up 3 -> decreased depth

forward 5 -> horizontal 5, depth = 0
down 5 -> depth=5
forward 8 -> horizontal is 13. And now depth is forward*(last up and down)=8*5=40
up 3 -> depth 5-3=2
down 8 -> depth 2+8 = 10
forward 2 -> horizontal is 15 and then depth is 2*10=20
// Total depth is 20+40=60 now

So at the end you multiply 15*10=150
 */
public class Dive {

    private final Commands commands = new Commands();

    public Dive() {
    }

    public void add(String direction, Integer unit) {
        commands.add(direction, unit);
    }

    public Integer depthHorizontalProduct() {
        return 0;

    }

    void addCommands(List<String> commands) {
        for (String entry : commands) {
            String[] directionUnitSplit = entry.split(" ");
            add(directionUnitSplit[0], Integer.parseInt(directionUnitSplit[1]));
        }
    }

    public int depth() {
        return commands.directionSumMap();
    }
}

