import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        double average = total / 3.0;
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("\n--- Student Report ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Total  : " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade  : " + grade);

        sc.close();
    }
}
