import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter #" + order + " number");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                counter++;
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            } else
                System.out.println("Invalid input");
            scanner.nextLine();
        }
        System.out.println("Min is: " + min + " and max is: " + max);
        scanner.close();

    }
}
