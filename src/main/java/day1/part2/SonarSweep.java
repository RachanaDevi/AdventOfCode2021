package day1.part2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Sonar sweep with 3 measurement window
 */
public class SonarSweep {

    private final List<Integer> sonarEntries;
    private static final int SLIDING_WINDOW_SIZE = 3;

    public SonarSweep(List<String> sonarEntries) {
        this.sonarEntries = sonarEntries.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    public int increasedMeasurements() {
        if (sonarEntries.size() < 4)
            return 0;

        int firstSlidingWindow = sumOfThreeElements(0);

        int increasedMeasurement = 0;
        for (int index = 1; index + SLIDING_WINDOW_SIZE - 1 < sonarEntries.size(); index++) {
            int secondSlidingWindow = sumOfThreeElements(index);
            if (firstSlidingWindow < secondSlidingWindow) {
                increasedMeasurement++;
            }
            firstSlidingWindow = secondSlidingWindow;

        }
        return increasedMeasurement;
    }

    public Integer sumOfThreeElements(int firstIndex) {
        return IntStream.range(firstIndex, firstIndex + SLIDING_WINDOW_SIZE)
                .mapToObj(sonarEntries::get).reduce(Integer::sum).get();
    }
}
