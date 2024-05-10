import java.util.Scanner;

public class demo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("The reversed string is :");
        String rev = ultaString(str);
        System.out.println(rev);
        sc.close();
    }
    static String ultaString(String str){
        String y = " ";
        for(int i = str.length()-1; i>=0; i--){
            y = y + str.charAt(i);
        }
        return y;
    }
}
