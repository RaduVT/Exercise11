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
        
        y = inputValue.nextInt();

        if (x > y){
            System.out.println("Order is " +x " and " +y);

        } else {
            System.out.println("Order is: " +y " and " +x);
        }
    }
}