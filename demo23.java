import java.util.Arrays;

public class demo23 {
    public static void main(String[] args) {
        String str = "The Quick Brown Fox Jumps Over Lazy Dog";
        isParagram(str);
        

        
    }
    static void isParagram(String str ){
        //remove the spaces inside the string
        str = str.replace(" ", "");
        //convert the string to either uppercase OR lowercase
        str = str.toLowerCase();
        //keep all the charcetrs of string inside a array
        char [] arr1 = str.toCharArray();
       
        //create a array which consists of all charcters from A to Z
        char [] arr2 = {'a','b','c','d','e','f','g','h',
        'i','j','k','l','m','n','o','p','q',
        'r','s','t','u','v','w','x','y','z'};
         //sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //compare both arrays 
        System.out.println(arr1);
             
    }
}
/*A string is called PARAGRAM
 if it contains all the charcters from A to Z*/
