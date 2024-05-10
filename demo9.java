public class demo9 {
    public static void main(String[] args) {
        Y obj = new Y(11);
    }
    
}
class X{
    public X(){
        System.out.println("In X");
    }
    public X(int n){
        this();
        System.out.println("In X int");
    }
}
class Y extends X{
    public Y(){
        super(5);
        System.out.println("In Y");
    }
    public Y (int n){
        this();
        System.out.println("In Y int");
    }

}