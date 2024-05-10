public class demo5 {
    public static void main(String[] args) {
        int arr[][][] = new int[2][3][3];
        for(int height = 0; height<2; height++){
            for(int row = 0; row<3; row++){
                for(int col = 0; col<3; col++){
                    arr[height][row][col] = (int)(Math.random()*100);
                }
            }
        }
        for(int z[][] : arr){
            for(int y[] : z){
                for(int x : y){
                    System.out.print(x + "\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            System.out.println(" ");
        }
//3Dimensional array
    }
    
}
