import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SelectionSortWithComparator {

    // Selection sort method implementation
    private static <T> void selectionSort(List<T> list, Comparator<T> comparator) {
        int listSize = list.size();

        for (int i = 0; i < listSize - 1; i++) {
            int min = i;
            for (int j = i + 1; j < listSize; j++) {
                if (comparator.compare(list.get(j), list.get(min)) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                T temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
    }

    public static void main(String[] args) {

        // Declaring input variable
        Scanner input = new Scanner(System.in);

        // Creating ArrayList to store Student objects
        List<Student> studentList = new ArrayList<>();

        // Adding Student instances to ArrayList
        studentList.add( new Student(20, "Richell", "409 E 40th St, NJ, 08007") );
        studentList.add( new Student(54, "Samuel", "15 John Way, WA, 27409") );
        studentList.add( new Student(12, "Jessica", "123 Street, NY, 44089") );
        studentList.add( new Student(6, "Ginny", "110 S Grove Ave, OH, 21110") );
        studentList.add( new Student(55, "Albert", "Better Luck City, WA, 27409") );
        studentList.add( new Student(69, "Susan", "19000 B 19th Highway, NY, 33019") );
        studentList.add( new Student(28, "Joseph", "12 Motts Drive, NY, 44809") );
        studentList.add( new Student(17, "Juan", "8 John Way, PA, 14389") );
        studentList.add( new Student(90, "Molly", "78 Mark Way, NJ, 09105") );
        studentList.add( new Student(82, "Betsy", "22 Mckinney Ave, NY, 33019") );
        
        // Displaying inital list
        System.out.println(studentList);

        try {
        
            // Allowing user to select sort option
            System.out.println("Please choose the desired sorting option (1 or 2)");
            System.out.println("1 - Sort by student name\n2 - Sort by student roll number\n");
            int choice = input.nextInt();

            if (choice == 1) {

                // Calling the selectionSort method with the list and student name comparator
                selectionSort(studentList, StudentNameComparator.StuNameComparator);

                // Printing the sorted list
                System.out.println("\nHere is the list after sorting by name: \n" + studentList);
                
            } 

            else if (choice == 2) {

                // Calling the selectionSort method with the list and student name comparator
                selectionSort(studentList, StudentRollnoComparator.StuRollno);

                // Printing the sorted list
                System.out.println("\nHere is the list after sorting by roll number: \n" + studentList);

            }
            else {
            System.out.println("Invalid option. Please try again.");
            }

        } catch (Exception e) {
            System.out.println("Invalid entry. Please try again with a valid number.");
        }


    }
}
