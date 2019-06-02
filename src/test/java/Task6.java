/*6. Write a method named getEvenDigitSum with one parameter of the type "int". The method should return the sum of even
digits within the number. If the number is negative, method should return -1;*/
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int n, r, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            if (r % 2 == 0) {
                s = s + r;
            }
            n = n / 10;
        }

        System.out.print("\nSum of Even Digits :" + s);

    }
}
