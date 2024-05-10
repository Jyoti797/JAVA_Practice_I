public class demo6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "Abhijit Mohanty";
        s1.rollNum = "FOS-MCA-2022-24-005";
        s1.marks = 85;
        s2.name = "Jashobanta Mohanty";
        s2.rollNum = "FOS-MCA-2022-24-004";
        s2.marks = 90;
        s3.name = "Jyoti Ranjan Mohanta";
        s3.rollNum = "FOS-MCA-2022-24-005";
        s3.marks = 92;
        Student mca[] = new Student[3];
        mca[0] = s1;
        mca[1] = s2;
        mca[2] = s3;
        for(Student x : mca){
            System.out.println(x.name);
            System.out.println(x.rollNum);
            System.out.println(x.marks);
        }
        //Array of objects
    }
}
class Student{
    String rollNum;
    String name;
    int marks;
}
