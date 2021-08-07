public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameStudent("Nguyễn Thanh Khiên");
        student.setId(151746);
        student.setMark(10);
        student.showInfo();

        Student student1 = new Student("Nguyễn Thị Phương", 122112, 9);
        System.out.println(student1.getNameStudent());
        student1.showInfo();

    }
}
