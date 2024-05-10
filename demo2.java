public class demo2 {
    public static void main(String[] args) {
        B obj = new B();
    }
}
//constructor over riding
class A {
    public A() {
        System.out.println("In A");
    }
}

class B extends A
{  
    public B() {
         super();
        System.out.println("In B");
    }

}
