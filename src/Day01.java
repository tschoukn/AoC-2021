import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day01 {
    public static void main(String[] args) {
        // test input
        List<Integer> testInput = Utils.readInput( "Day01-Test" ).stream().map(Integer::parseInt).collect(Collectors.toList());

        if (part1(testInput) != 7) {
            throw new IllegalStateException("Test not successful.");
        }

        if (part2(testInput) != 5) {
            throw new IllegalStateException("Test not successful.");
        }

        // solution
        List<Integer> input = Utils.readInput( "Day01" ).stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.printf( "Solution for part 1: %d%n", part1( input ) );
        System.out.printf( "Solution for part 2: %d%n", part2( input ) );
    }

    private static int part1(List<Integer> input) {
        int counter = 0;
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) > input.get(i - 1)) {
                counter++;
            }
        }

        return counter;
    }

    private static int part2(List<Integer> input) {
        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < input.size() - 2; i++) {
            heights.add(input.get(i) + input.get(i + 1) + input.get(i + 2));
        }

        return part1(heights);
    }
}
