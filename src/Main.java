import java.util.Scanner;
class Exercise11 {
    public static void main(String [] args){
        int x;
        int y;
        Scanner inputValue;
        inputValue = new Scanner (System.in);
        
        System.out.println("Enter first number:");                
        x = inputValue.nextInt();
        
        System.out.println("enter second number:");
        y = inputValue.nextInt();

        if (x > y) {
            System.out.println("The biggest number is: " +x);
        } else {
            System.out.println("the biggest number is: " +y);
        }
    }
}
