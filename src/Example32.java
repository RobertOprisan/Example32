import java.util.Scanner;
public class Example32 {
    public static void main(String[] args) {
        double x, y, n;

        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();

        x = n;
        for (int i = 1; i <= 10; i++){
            y = 1d / 2d * ( x + n / x);
            x = y;

        }
        System.out.println(x);

    }
}
