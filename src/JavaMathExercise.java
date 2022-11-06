import java.util.Scanner;

class JavaMathExercise {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);                                                    
        Double number1, number2, maximum, minimum, square1, square2;
        
        // here we get number1 and number2 value
        System.out.println("Please enter 1st number: ");
        number1 = input.nextDouble();
        System.out.println("Please enter 2nd number: ");
        number2 = input.nextDouble();

        //then we find the maximum value of given number1 and number2
        maximum = Math.max(number1, number2);
        System.out.println("The maximum of " + number1 + " and " + number2 + " is: " + maximum);

        //then we find the minimum value of given number1 and number2    
        minimum = Math.min(number1, number2);
        System.out.println("The minimum of " + number1 + " and " + number2 + " is: " + minimum);

        //finally we get the square root of number1 and number2 individually
        square1 = Math.sqrt(number1);
        System.out.println("The square root of " + number1 + " is: " + square1);
        square2 = Math.sqrt(number2);
        System.out.println("The square root of " + number2+  " is: " + square2);

    }
    
}
