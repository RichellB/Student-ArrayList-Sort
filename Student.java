public class Student {
    // Student class implementation

    public int rollno;
    public String name, address;

    // Class constructor
    public Student(int stdRollno, String stdName, String stdAddress) {
        this.rollno = stdRollno;
        this.name = stdName;
        this.address = stdAddress;
    }

    // Setter and getter methods
    public void setStudentname(String stdName) {
        this.name = stdName;
    }

    public void setRollno(int stdRollno) {
        this.rollno = stdRollno;
    }
    
    public void setStudentAddress(String stdAddress) {
        this.address = stdAddress;
    }	

    public String getStudentname() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getStudentAddress() {
        return address;
    }
    

    // Custom toString method
       @Override
       public String toString() {
           return "[ rollno=" + rollno + ", name=" + name + ", age=" + address + "]";
       }

}

