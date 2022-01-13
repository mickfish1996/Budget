package Budget;

public class Balance {
    private float balance = 0;
    private String month = "";
    private int year = 0;

    /********************************************************************************
     * Get Balance:
     * This function will return the value of Balance to the fuction that calls it.
     ********************************************************************************/
    public float getBalance(){
        return balance;
    }

    /********************************************************************************
     * Set Balance:
     * This function will update the value of balance using the information that 
     * is passed into it.
     ********************************************************************************/
    public void setBalance(float newBalance){
        balance = newBalance;
    }

    /********************************************************************************
     * Get Month:
     * This function will return the value of Month to the function that calls it.
     ********************************************************************************/
    public String getMonth(){
        return month;
    }

    /********************************************************************************
     * Set Month:
     * This function will update the value of month using the information that 
     * is passed into it.
     ********************************************************************************/
    public void setMonth(String newMonth){
        month = newMonth;
    }

    /********************************************************************************
     * Get Year:
     * This function will return the value of Year to the function that calls it.
     ********************************************************************************/
    public int getYear(){
        return year;
    }
    
    /********************************************************************************
     * Set Year:
     * this function will update the value of year using the information that 
     * is passed into it.
     ********************************************************************************/
    public void setYear(int nYear){
        year = nYear;
    }
}
