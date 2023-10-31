package day2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static day2.part1.Constants.*;

public class Commands {

    private final List<Command> commands = new ArrayList<>();

    public void add(String direction, Integer unit) {
        commands.add(new Command(direction, unit));
    }

    int size() {
        return commands.size();
    }

    public boolean isEmpty() {
        return commands.isEmpty();
    }

    public boolean hasDepthDirections() {
        return commands.stream().anyMatch(command -> command.direction().equals(DOWN_COMMAND) || command.direction().equals(UP_COMMAND));
    }

    public boolean hasForwardDirection() {
        return commands.stream().anyMatch(command -> command.direction().equals(FORWARD_COMMAND));
    }


    public Map<String, Integer> directionSumMap() {
        commands.forEach();
//        var directionSumMap = new HashMap<String, Integer>();
//        commands.forEach(command -> {
//            int newUnit = command.unit();
//
//            if (directionSumMap.containsKey(command.direction())) {
//                newUnit = directionSumMap.get(command.direction()) + command.unit();
//            }
//            directionSumMap.put(command.direction(), newUnit);
//
//        });
//        return directionSumMap;
    }
}