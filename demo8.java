public class demo8 {
    public static void main(String[] args) {
        Human obj = new Human();
       System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
class Human{
    private int age;
    private String name;
      public void setAge(int age) {
        this.age = age;
    }
    public Human(){
        age = 100;
        name = "John Cena";
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}