public class oops1{
    public static void main(String[] args) {
        Person p1 = new Person("Jyoti Ranjan Mohanta", 24);
        Person p2 = new Person("Abhijit Mohanty", 23);
        p1.ahow();
        p2.ahow();
        
    }
}
class Person{
    String name;
    int age;
  
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void ahow(){
        System.out.println(this.name + " : " + this.age);
    }
}