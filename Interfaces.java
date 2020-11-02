public class Interfaces 
{
    public static void main(String[] args) 
    {
        
        HSBC hsbc = new HSBC();
        Banking(hsbc);

    }

    static public void Banking(BankOfEngland bankingRef)
    {
        bankingRef.showBalance();
        bankingRef.openAccount();
    }
}

interface BankOfEngland
{
    public void openAccount();
    public void showBalance();
}


class QA 
{
    public void message()
    {
        System.out.println("Welcome to QA");
    }
}

class HSBC extends QA implements BankOfEngland
{
    public void openAccount()
    {
        System.out.println("Account open in HSBC");
    }

    public void showBalance()
    {
        System.out.println("show balance in HSBC");
    }
}


