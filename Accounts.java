public class Accounts {
    public static void main(String[] args) 
    {
        Accounts salesDepartment = new Accounts();
        Accounts ItDepartment = new Accounts();


        try
        {
            salesDepartment.salarySLip("shafeeq", 1000, 8);
        }
        catch(AbsentiesException E)
        {
            System.out.println("please send the report");
        }

        try
        {
            salesDepartment.salarySLip("Ali", 5000,11);
        }
        catch(AbsentiesException E)
        {
            System.out.println("please send the report");
        }
    }

    public void salarySLip(String name, int salary, int absenties) throws AbsentiesException
    {
        float tax, netSalary;
    
            if(absenties>10)
            {
                AbsentiesException ref = new AbsentiesException();
                throw ref;
            }
            else
            {
                tax = (float) salary* 25/100;
                netSalary = salary - tax;
                System.out.println("net salary is: " + netSalary);

            }
        
    }

    class AbsentiesException extends Exception
    {

    }
    
} 