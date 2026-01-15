import java.util.Scanner;
class AddTwoNumbersMethod {
static void add(int a, int b) {
 System.out.println("Sum = " + (a + b));
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
add(x, y);
sc.close();
    }
}
