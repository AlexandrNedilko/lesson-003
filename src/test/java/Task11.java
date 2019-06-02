//11. Write a program which prints the next figure to the console
public class Task11 {
    public static void main(String[] args) {

        StringBuilder mInfoTextView = new StringBuilder();
        for (int i = 0; i < 6; i++) {  //для числа строк
            for (int j = 0; j < 6 - i; j++)  //для печати пробелов
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)  //для печати звездочек
                System.out.print("*");
            System.out.println(mInfoTextView.toString());
        }
    }
}
