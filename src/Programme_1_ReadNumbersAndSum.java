import java.util.Scanner;

public class Programme_1_ReadNumbersAndSum {

    public static void readTwoNumbersAndSum() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter the number " + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;}
                } else {
                    System.out.println("Invalid number");
                }
                scanner.nextLine();
            }

            System.out.println("sum =" + sum);
            scanner.close();
        }
    public static void main(String[] args) {
        readTwoNumbersAndSum();

    }


}
