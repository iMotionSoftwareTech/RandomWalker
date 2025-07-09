//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        // Input validation for r
        if (r < 0) {
            System.out.println("Error: r must be a non-negative integer.");
            return;
        }

        // Initialize walker's position and step count
        int x = 0; // Current x-coordinate of the walker, starts at center
        int y = 0; // Current y-coordinate of the walker, starts at center
        int steps = 0; // Steps taken in the current walk

        // 2. Print initial coordinates
        System.out.println("(" + x + ", " + y + ")");

        // 3. Simulate a single random walk until Manhattan distance 'r' is reached
        // The loop continues as long as the Manhattan distance is less than 'r'.
        // Manhattan distance = |x| + |y|
        while (Math.abs(x) + Math.abs(y) < r) {
            // Generate a random number to decide direction (0: North, 1: South, 2: East, 3: West)
            // Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive).
            // Multiplying by 4 gives a value between 0.0 and 4.0.
            // Casting to int truncates the decimal, resulting in 0, 1, 2, or 3.
            int direction = (int) (Math.random() * 4);

            if (direction == 0) { // North
                y++;
            } else if (direction == 1) { // South
                y--;
            } else if (direction == 2) { // East
                x++;
            } else if (direction == 3) { // West
                x--;
            }
            steps++; // Increment step count for the current walk
            System.out.println("(" + x + ", " + y + ")"); // Print coordinates at each step
        }

        // 4. Print total steps taken
        System.out.println("steps = " + steps);
    }
}