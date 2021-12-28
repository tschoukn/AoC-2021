import java.util.List;

public class DayXX {
    public static void main(String[] args) {
        // test input
        List<String> testInput = Utils.readInput( "DayXX-Test" );

        if (part1(testInput) != 0) {
            throw new IllegalStateException("Test not successful.");
        }

        if (part2(testInput) != 0) {
            throw new IllegalStateException("Test not successful.");
        }

        // solution
        List<String> input = Utils.readInput( "DayXX" );
        System.out.printf( "Solution for part 1: %d%n", part1( input ) );
        System.out.printf( "Solution for part 2: %d%n", part2( input ) );
    }

    private static int part1(List<String> input) {
        return 0;
    }

    private static int part2(List<String> input) {
        return 0;
    }
}
