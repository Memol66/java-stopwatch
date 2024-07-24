import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        long startTime = 0+0, endTime = 0;

        System.out.println("Press 's' to start the stopwatch and 'e' to stop it:");
        while (true) {
            ch = scanner.next().charAt(0);
            if (ch == 's' || ch == 'S') {
                startTime = System.currentTimeMillis();
                System.out.println("Stopwatch started.");
            } else if (ch == 'e' || ch == 'E') {
                endTime = System.currentTimeMillis();
                System.out.println("Stopwatch stopped.");
                long elapsedTime = endTime - startTime;
                System.out.println("Elapsed time: " + (elapsedTime / 1000) + " seconds");
                break;
            }
        }
    }
}
