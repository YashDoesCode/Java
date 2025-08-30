public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int distance = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")");
        while (distance != r) {
            double rr = Math.random();
            if (rr <= 0.24) x--;      
            else if (rr <= 0.49) y++; 
            else if (rr <= 0.74) x++;  
            else y--;                  

            System.out.println("(" + x + ", " + y + ")");
            distance = Math.abs(y) + Math.abs(x); 
            steps++;
        }
        System.out.println("Steps: " + steps);
    }
}