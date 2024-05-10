public class demo16 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6,7,8},{9,10,11},{13,14}};
        for(int []y : arr){
            for(int x : y){
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    }
}
//Enhanced for loop 
