public class demo3 {
    public static void main(String[] args) {
    int arr[][] = new int[3][4];
    for(int row = 0; row<3; row++){
        for(int col = 0; col<4; col++){
            arr[row][col] = (int)(Math.random() * 100);
        }
    }
    for( int n[] : arr){
        for(int i : n){
            System.out.print(i + "  ");
        }
        System.out.println(" ");
    }
//2dimensional array
 }    
}
