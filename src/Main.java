import java.util.Scanner;
class Exercise11 {
    public static void main(String [] args){
        int x;
        System.out.println("Enter first number:");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        int y;
        System.out.println("enter second number:");


        inputValue = new Scanner(System.in);
        y = inputValue.nextInt();

        if (x > y){
            System.out.println("The biggest number is: " +x);

        } else {
            System.out.println("the biggest number is: " +y);
        }
    }
}