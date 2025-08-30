public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        long totalSteps = 0;

        for (int t = 0; t < trials; t++) {
            int x = 0;
            int y = 0;
            int distance = 0;
            int steps = 0;

            while (distance != r) {
                double rr = Math.random(); 
                if (rr <= 0.24) x--;       
                else if (rr <= 0.49) y++; 
                else if (rr <= 0.74) x++;  
                else y--;                 

                distance = Math.abs(y) + Math.abs(x);
                steps++;
            }
            totalSteps += steps; 
        }

        System.out.println("Average number of steps = " + (double) totalSteps / trials);
    }
}