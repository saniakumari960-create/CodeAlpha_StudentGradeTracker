import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        int total = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / n;

        System.out.println("\n===== STUDENT GRADE REPORT =====");

        for (int i = 0; i < n; i++) {
            System.out.println("Student: " + names[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}