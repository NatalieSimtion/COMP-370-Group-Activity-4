import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input the number of seconds: ");
        int input = keyboard.nextInt();
        runTimer(input);
    }

    public static void runTimer(int seconds) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int time = seconds;

            public void run() {
                System.out.println(time);
                time--;

                if (time < 0) {
                    timer.cancel();
                    System.out.println("Time is up!");
                }
            }
        }, 0, 1000);
    }

}
