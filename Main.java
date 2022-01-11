package Budget;

public class Main {
    
    /* This method will display all the text that the program is needing
       to display. It will use the formating that it is sent. */
    static void displayText(String text){
        System.out.println(text);
    }

    /* Main will run the program, when it needs to it will call the other methods
       that are in the class. It will also provide a menue that the user can select
       what they want to do with the program.*/
    public static void main(String[] args){
        displayText("\nBudgeting Program");
        boolean keepGoing = true; // Used in the while loop
        while (keepGoing){
        displayText("\t1. View Balance\n\t2. Add Spending\n\t3. Exit\n");
        keepGoing = false; // updates to make the loop stop.
        }
    }
}
