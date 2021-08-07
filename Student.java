public class Student {

    private String nameStudent;
    private int id;
    private float mark;

    public Student() {

    }

    public Student(String name, int id, float mark) {
        this.nameStudent = name;
        this.id = id;
        this.mark = mark;
    }

    public String getNameStudent() {
        return this.nameStudent;
    }

    public void setNameStudent(String name) {
        this.nameStudent = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void showInfo() {
        System.out.println("Name Student: " + nameStudent);
        System.out.println("ID: " + id);
        System.out.println("Mark: " + mark);
    }
}