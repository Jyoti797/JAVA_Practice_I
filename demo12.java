public class demo12 {
    public static void main(String[] args) {
        Status s = Status.Pending;
        System.out.println(s.ordinal());
        
    }
}
 enum Status{
        Running, Failed, Pending, Success;
    }
