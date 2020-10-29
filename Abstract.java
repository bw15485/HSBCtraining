
public class Abstract 
{
    public static void main(String[] args) {
        
    }


    public static void doDrawing(Draw x)
    {

    }
}



abstract class Draw
{
    abstract void Drawing();
}


class DrawLine extends Draw
{
    public void Drawing()
    {
        System.out.println("Draw the line")
    }
}






