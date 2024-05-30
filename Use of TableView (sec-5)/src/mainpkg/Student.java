package mainpkg;

public class Student extends User{
    private float cgpa;
    private String major;
    private static String uniName="IUB"; 

    public Student(){}
    
    public Student(int id, String name, String gender, String password, String major, float cgpa) {
        super(id, name, password, gender);
        this.cgpa = cgpa;
        this.major = major;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public static String getUniName() {
        return uniName;
    }

    public static void setUniName(String uniName) {
        Student.uniName = uniName;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +  ", cgpa=" + cgpa + ", major=" + major + '}';
    }  
    
}
