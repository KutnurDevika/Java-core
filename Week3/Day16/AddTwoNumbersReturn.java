import java.util.Scanner;
class AddTwoNumbersReturn {
static int add(int a, int b) {
        return a + b;
    }
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
 int y = sc.nextInt();
System.out.println("Sum = " + add(x, y));
 sc.close();
    }
}
