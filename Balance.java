package Budget;

public class Balance {
    private float balance = 0;
    private String month = "";
    private int year = 0;

    public float getBalance(){
        return balance;
    }

    public void setBalance(float newBalance){
        balance = newBalance;
    }

    public String getMonth(){
        return month;
    }

    public void setMonth(String newMonth){
        month = newMonth;
    }

    public int getYear(){
        return year;
    }
    
    public void setYear(int nYear){
        year = nYear;
    }
}
