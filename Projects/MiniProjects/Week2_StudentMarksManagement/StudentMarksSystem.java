import java.util.Scanner;
public class StudentMarksSystem {
    static int calculateTotal(int[] marks) {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
    static double calculateAverage(int total, int n) {
        return total / (double) n;
    }
    static void displayResult(double avg) {
        if (avg >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Week 2 Mini Project -----");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total, n);

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        displayResult(average);

        sc.close();
    }
}

