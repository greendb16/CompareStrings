
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the Weather?");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("rain")) {
            System.out.println("Take your Umbrella!");
        } else if (answer.equalsIgnoreCase("windy")) {
            System.out.println("Wear you jacket!");
        } else if (answer.equalsIgnoreCase("snow")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equalsIgnoreCase("stormy")) {
            System.out.println("You should stay inside");
        } else {
            System.out.println("Enjoy your day!");
        }

    }
}
