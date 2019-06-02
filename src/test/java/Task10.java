//10. Write a program which prints the next figure to the console
public class Task10 {
    static void drawLineX (int x) {
        for (int i=0; i<x; i++)
            System.out.print("***");
        System.out.println();
    }

    static void drawLineY (int y, int x) {
        for (int i=0; i<y; i++){
            System.out.print("*");
            for (int j=0; j<(3*x-2);j++ )
                System.out.print(" ");
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        int x=3;
        int y=3;
        drawLineX(x);
        drawLineY(y, x);
        drawLineX(x);
    }

}
