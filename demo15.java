public class demo15 {
    public static void main(String[] args) {
       sum(new int[]{1,2,3,4});
        
    }
     static void sum(int []arr){
        int result = 0;
        for(int n : arr){
            result = result + n;
        }
        System.out.println("The sum of the elemenmts inside array is " + result);
    }
}
