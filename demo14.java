public class demo14 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int sumOfAllValues = 0;
        for(int n : arr){
            sumOfAllValues = sumOfAllValues + n;
        }
        System.out.println("Sum of all values present inside array is " + sumOfAllValues);
    }
    
}
