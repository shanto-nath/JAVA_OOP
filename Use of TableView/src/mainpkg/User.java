package mainpkg;

public abstract class User {
    protected int id;
    //private int id;
    protected String name, gender, password;
    protected static String uniName="IUB";
    //protected static String uniName;

    public abstract void doSome();
    
    public User() {
    }

    public User(int id, String name, String gender, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getUniName() {
        //id++;
        return uniName;
    }

    public static void setUniName(String uniName) {
        User.uniName = uniName;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name + ", gender=" + gender + ", password=" + password ;
    }
    
    
    
}
