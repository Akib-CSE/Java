package blood_donation;

public class Person extends Blood_Info{
    private int id;
    private String name;
    private int age;
    private String contactNo;
    private String professon;

    public Person(int id, String name, int age, String contactNo, String professon, String bloodGroup, String lastDate, int totalDonate) {
        super(bloodGroup, lastDate, totalDonate);
        this.id = id;
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
        this.professon = professon;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getProfesson() {
        return professon;
    }

    public void setProfesson(String professon) {
        this.professon = professon;
    }

    @Override
    public String toString() {
        return "\nID = " + id + "\nName = " + name + "\nAge = " + age + "\nContactNo = " + contactNo + "\nProfesson = " + professon + "\nBlood Group = " + getBloodGroup() + "\nLast Date = " +getLastDate()+ "\nDonate Time = " + getTotalDonate();
    }

    
    
    
       
}
