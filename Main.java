package Budget;

public class Main {
    
    static void displayText(String text){
        System.out.println(text);
    }
    public static void main(String[] args){
        displayText("\nBudgeting Program");
        boolean keepGoing = true;
        while (keepGoing){
        
        displayText("\t1. View Balance\n\t2. Add Spending\n\t3. Exit\n");
        keepGoing = false;
        }
    }
}
