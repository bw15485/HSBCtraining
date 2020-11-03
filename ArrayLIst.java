
import java.util.ArrayList;

public class ArrayLIst 
{
    
    ArrayList<String> employees = new ArrayList<String>();

    public ArrayLIst()
    {
        employees.add("ben");
        employees.add("ali");
        employees.add("tony");
        employees.add("john");
    }

    public void AddRecord(String newRecord)
    {
        employees.add(newRecord);
    }

    public void removeRecord(int regno)
    {
        employees.remove(reno);
    }

    public void printList()
    {
        System.out.println(employees);
    }

    public String returnRecord(int position)
    {
        return employees(position)
    }



    public static void main(String[] args) 
    {
        ArrayLIst nlist = new ArrayLIst();

        nlist.printList();
        nlist.AddRecord("Alex");
        nlist.printList();
        nlist.removeRecord(0);
        nlist.printList();


    }
    
}