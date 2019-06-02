//9. Write a program which prints the next figure to the console
    public class Task9 {

        public static void main(String[] args) {

            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j > i; j--) {
                    System.out.println(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }