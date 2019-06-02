//4. Given an array of 10 integers. To display the sum of all its elements except the first and last.
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int[] array = {5, 15, 18, 48, -10, 0, 65, 88, 55, 82};
        int sum = 0;
        for(int i = 1; i < array.length - 1; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum is: " + sum);
    }
}
