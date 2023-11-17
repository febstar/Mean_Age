import java.util.Scanner;


public class StudentInfoByChiomaUkoha {
    public static void main(String[]args) {
        int sumOfAges = 0;
        String[] names = new String[10];
        int[] ages = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name of student studying Computer Science" + (i + 1) + ":");
            names[i] = scanner.nextLine();

            System.out.print("Enter the age of student" + (i+1) + ":");
            ages[i] = scanner.nextInt();
            scanner.nextLine();

            sumOfAges += ages[i];
        }

        double averageAge = (double)sumOfAges/10;

        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + ":"+ ages[i]+ "years");
        }

        System.out.println("\nSum of Ages: " + sumOfAges + " years");
        System.out.println("Average Age: " + averageAge + " years");

        scanner.close();
    }
}
