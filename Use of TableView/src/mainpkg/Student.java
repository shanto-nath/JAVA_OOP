package mainpkg;

public class Student extends User{
    private float cgpa;
    private String major;

    public Student() {
    }

    public Student(float cgpa, String major) {
        this.cgpa = cgpa;
        this.major = major;
    }

    public Student(int id, String name, String gender, String major, float cgpa, String password) {
        super(id, name, gender, password);
        //this.id=id;
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

    @Override
    public String toString() {
        return "Student{" + super.toString() + "cgpa=" + cgpa + ", major=" + major + '}';
    }
    
    
    
}
