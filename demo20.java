import java.util.Scanner;

public class demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
       
        String result = " ";
        String [] arr = str.split(" ");
        for(int i = arr.length-1; i>=0; i--){
          result = result + arr[i] + " ";
        }
        System.out.println("The resultant string is :");
        System.out.println(result);
         sc.close();
    } 
    
}

//Honey Singh----> Singh Honey
