import java.util.*; 

public class HashMapping
{

    HashMap<String,String> set =new HashMap<String,String>();  

    public static void main(String[] args) 
    {
        HashMapping ref = new HashMapping();
        ref.storeData();
        ref.display();
        
    }

    public void storeData()
    {
        set.put("England", "London");
        set.put("Germany", "Berlin");
        set.put("USA", "Washington");
    }


    public void display()
    {
        System.out.println(set);
    }

    // public void LoopThroughALlElement()
    // {
    //     for(String i : set)
    //     {
    //         System.out.println(i)
    //     }
    // }
}