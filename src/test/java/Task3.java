//3. Fill the array with numbers from 100 to 0.
public class Task3 {
    public static void main(String[] args) {
        int size = 101;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100 - i;
            System.out.println(arr[i]);
        }
    }
}