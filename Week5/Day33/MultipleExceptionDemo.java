public class MultipleExceptionDemo {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[10] = 50;   // ArrayIndexOutOfBoundsException

            int a = 10;
            int b = 0;
            int result = a / b;  // ArithmeticException

            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            System.out.println("Execution finished");
        }
    }
}
