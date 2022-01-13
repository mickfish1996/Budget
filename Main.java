package Budget;
import java.util.Scanner;

public class Main {
    
    /******************************************************************************** 
     * This method will display all the text that the program is needing
     * to display. It will use the formating that it is sent. 
     ********************************************************************************/
    static void displayText(String text){
        System.out.println(text);
    }
    
    /******************************************************************************** 
     * User Input will Prompt the user for the number that they would like to enter.
     * If they enter the wrong number than it will prompt again  
     ********************************************************************************/
    static int userInput(){
        int userIn = 0;
        try{
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter a number: ");

            userIn = myObj.nextInt();
            
        }

        catch(Exception e){
            System.out.println("Please enter a number between 1 and 3");
        }
        return userIn;
    }

    /******************************************************************************** 
     * Main will run the program, when it needs to it will call the other methods
     * that are in the class. It will also provide a menue that the user can select
     * what they want to do with the program.
     ********************************************************************************/
    public static void main(String[] args){
        displayText("\nBudgeting Program");
        boolean keepGoing = true; // Used in the while loop
        int input = 0;
        displayText("\t1. View Balance\n\t2. Add Spending\n\t3. Exit\n");
        while (keepGoing){   
            input = userInput();
            if (input < 1 || input > 3){
                displayText("Please enter a number between 1 and 3");
            }
            else{
                keepGoing = false; // updates to make the loop stop.
            }
        }
        switch(input){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
