import java.util.Comparator;

// Comparator class to sort student roll numbers
public class StudentRollnoComparator {
     public static Comparator<Student> StuRollno = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
    
           int rollno1 = s1.getRollno();
           int rollno2 = s2.getRollno();
    
           // Sorting in ascending order
           return rollno1-rollno2;
           
       }};
}
