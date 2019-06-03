/*7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
        If one of the parameters is < 10, method should return -1 to indicate an invalid value.
        The method should return the greatest common divisor of two numbers.*/



public class Task7 {

    public static void main(String[] args) {
        int del = getGreatestCommonDivisor(20, 40);
        System.out.println(del);
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) return -1;
        if(first < second){
            int temp = first;
            first = second;
            second = temp;
        }
        for(int index = second;index > 1;index--){
            if(first % index == 0 && second % index == 0){
                return index;
            }
        }
        return 1;
    }

}
