public class demo31{
    public static void main(String[] args) {
        Btech s1 = new Btech();
        s1.name = "Jyoti Ranjan Mohanta";
        s1.rollNum = "FOS-MCA-2022-24-005";
        s1.study();
       
    }
}
class Btech{
    String name;
    String rollNum;
    void study(){
        System.out.println("Nmae of the student : " + this.name);
        System.out.println("Roll NUmber : " + this.rollNum);
    }

}