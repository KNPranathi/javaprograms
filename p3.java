//write a program to find the given number neagative or positive input as 123
public class PositiveNegative {
    public static void main(String[] args) {

        int num = 123;

        if (num > 0) {
            System.out.println(num + " is a Positive number");
        } 
        else if (num < 0) {
            System.out.println(num + " is a Negative number");
        } 
        else {
            System.out.println("The number is Zero");
        }
    }
}
