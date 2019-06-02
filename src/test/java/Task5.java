//5.Write a function which calculates and returns the minimum of 4 arguments

public class Task5 {

    public static void main(String[] args) {
        int min = min(11, 35, 5, 84);
        System.out.println(min);
    }


    public static int min(int a, int b, int c, int d) {
        int min = min(a, b);
            if (c< min  ) {
                min=c;
            } else if (d < min) {
                min=d;
            }
            return min;

    }

    public static int min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }

    }
}