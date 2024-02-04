import java.util.Comparator;

// Comparator class to sort student names
public class StudentNameComparator {
    
    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
           String StudentName1 = s1.getStudentname().toUpperCase();
           String StudentName2 = s2.getStudentname().toUpperCase();
    
           // Sorting in ascending order
           return StudentName1.compareTo(StudentName2);
    
        }};

}
