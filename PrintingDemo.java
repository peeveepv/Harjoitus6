/**
 * Created by Administrator on 29.9.2017.
 */
public class PrintingDemo {
    public static void main(String args[]) {
        try {
            try {
                System.out.print("A");
                int b = 100 / 0;
            } catch (ArithmeticException e) {
                System.out.print("B");
            }
            try {
                int a[] = new int[3];
                a[3] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("C");
            }
            System.out.print("D");
        } catch (Exception e) {
            System.out.print("E");
        }
        System.out.print("F");
    }
}
