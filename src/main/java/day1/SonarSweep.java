package day1;

import java.util.List;
import java.util.stream.Collectors;

/*
How quickly the depth increases
 */
public class SonarSweep {

    private final List<Integer> sonarEntries;

    public SonarSweep(List<String> sonarEntries) {
        this.sonarEntries = sonarEntries.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    public int increasedMeasurements() {
        int increasedMeasurement = 0;
        if (sonarEntries.size() <= 1)
            return 0;
        for (int index = 1; index < sonarEntries.size(); index++) {
            if (sonarEntries.get(index) > sonarEntries.get(index - 1)) {
                ++increasedMeasurement;
            }
        }
        return increasedMeasurement;
    }
}
