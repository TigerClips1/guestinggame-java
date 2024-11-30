// Make the package name
package src.java;
//Import the input class
import java.util.Scanner;

// make an Main class
public class Main
{
    // make a Main function
    public static void main(String[] args)
    {
        //define a integer variables
        int favnum = 5;
        // try the program if the user input a string then it wi;; catch the error
        try
        {
            // loop it until it true which is the number 5
            while(true)
            {
                // ask the user for input
                System.out.print("Please Guest my favnum: ");
                // grab the userinput
                Scanner num = new Scanner(System.in);
                // use that input it grab for the checking
                int nums = num.nextInt();
                // if nums is equal to fav num then break outta the loop
                if(nums == favnum){
                    // print a happy you win text
                    System.out.println("Congrats are guessing the right number");
                    break;
                    // else if the user input the worng number it will say please try again to the console
                } else {
                    System.out.println("Please Try Again");
                }

            }
        }
        // catch the the int exception
        catch (Exception e)
        {
            // print a better text in the console
            System.out.println("Please Use an Number not a string");
        }
    }
}