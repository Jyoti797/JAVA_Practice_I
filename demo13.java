public class demo13{
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6,7,8},{9,10,11}};
        for(int []n : arr){
            for(int x : n){
                System.out.print(x + "\t");
            }
            System.out.println(" ");
        }
    }
}