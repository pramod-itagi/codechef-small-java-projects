package SmallProjects;

import java.util.Scanner;

public class DigitalClockAndCountDownTimer {
  public static Scanner scanner = new Scanner(System.in); // Moved to static field

  public static void main(String[] args) {
    while (true) {
      System.out.print("Choose an option (1:Digital Clock, 2:Countdown Timer): ");
      String choice = scanner.nextLine().trim();
      userChoice(choice);
    }
  }

  public static void userChoice(String choice) {
    if (choice.equals("1")) {
      digitalClock();
    } else if (choice.equals("2")) {
      System.out.println("Enter the number of seconds to countdown");
      int seconds = scanner.nextInt();
      scanner.nextLine();
      countdownTimer(seconds);
    } else {
      System.out.println("Invalid choice!");
    }
  }

  public static void digitalClock() {
    System.out.println("Digital clock is displayed.");
  }

  public static void countdownTimer(int seconds) {
    System.out.println("Counting down from " + seconds + " seconds.");
  }
}
