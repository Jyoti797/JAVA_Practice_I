import java.util.Arrays;
public class demo24 {
    public static void main(String[] args) {
        String str1 = "GEEKSFORGEEKS";
        removeDuplicate(str1);
    }
    static void removeDuplicate(String str){
        //inedx to track location of next charcter in INPUT string
        int input = 1;
        //index to track location of next charcter in OUTPUT string
        int output = 1;

        //convert string to charcter array
        char [] arr = str.toCharArray();

        //sort the array
        Arrays.sort(arr);

        /*check wheather the charcter is present before or not
         If it is not present before then add it to the resultant string*/
         while(input != arr.length){
            if(arr[input] != arr[input-1]){
                arr[output] = arr[input];
                output++;
            }
            input++;
         }
         String result = new String(arr);
         System.out.println(result.substring(0, output));
    }
  
}
//WAP to find remove duplicate charcters from a string
