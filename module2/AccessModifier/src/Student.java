import java.sql.SQLOutput;

public class Student {
    private String name="name";
    private String classes="class";
    public Student(){
    }
    public Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getClasses(){
        return classes;
    }
    public void setClasses(){
        this.classes=classes;
    }

    public static void main(String[] args) {
        Student stu=new Student("John","C02");
        System.out.println(stu.getName());
        System.out.println(stu.getClasses());
    }
}
