import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) 
    {
        ArrayList<Student> listOfStudents = new ArrayList<Student>();

        Student student1 = new Student(10, "ben", 52);
        Student student2 = new Student(4, "tony", 60);
        Student student3 = new Student(8, "alex", 70);
        Student student4 = new Student(12, "john", 80);

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        
        Main1 ref = new Main1(); 
        System.out.println(ref.returnNameOfStudentWithRegno(10, listOfStudents));      
    }


    public String returnNameOfStudentWithRegno(int num, ArrayList<Student> listOfStudents)
    {
        String student;

        for(int i = 0; i < listOfStudents.size(); i++)
        {
            if(listOfStudents.get(i).regno == num)
            {
                return listOfStudents.get(i).name;
            }
        }
        return "student not found";

    }
    
}