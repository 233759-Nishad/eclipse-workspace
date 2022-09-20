
class Student
{        
    int rollno;        
    String name;        
    static String college = "ITS";        //static method to change the value of static variable        
    static void change()
    {       
        college = "MES Asmabi";        
    }       
    //constructor to initialize the variable        
    Student(int r, String n)
    {        
        rollno = r;        
        name = n;        
    }       
    //method to display values        
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}



public class TestStaticMethod {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
         Student.change();//calling change method      
         //creating objects      
         Student s1 = new Student(07,"chandini");      
         Student s2 = new Student(23,"sandra");       
         Student s3 = new Student(21,"nishad");      
         //calling display method    
         s1.display();     
         s2.display();     
         s3.display();



   }
}