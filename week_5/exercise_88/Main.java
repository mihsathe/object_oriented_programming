import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner userReader = new Scanner(System.in);
        ArrayList<Student> arrayListOfStudents = new ArrayList<Student>();
        
        String name = ""; 
        String studentNumber = "";
        
        while (true) {
            System.out.print("name: ");
            name = userReader.nextLine();
            
            if (name.isEmpty()) {
                break;
            } else {
                System.out.print("studentnumber: ");
                studentNumber = userReader.nextLine();
                Student newStudent = new Student(name, studentNumber);
                arrayListOfStudents.add(newStudent);
            }
        }
        
        System.out.println("");
        
        for (Student student: arrayListOfStudents) {
            System.out.println(student);
        }
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String searchWord = userReader.nextLine();
        System.out.println("Result: ");
        
        for (Student student: arrayListOfStudents) {
            if (student.getName().contains(searchWord)) {
                System.out.println(student);
            }
        }
        
    }
}