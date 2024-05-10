public class demo4 {
    public static void main(String[] args) {
        int nums[][] = new int[5][4];
        for(int row = 0; row<5; row++){
            for(int col = 0; col<4; col++){
                nums[row][col] = (int)(Math.random()*100);
            }
        }
        for(int y[] : nums){
            for(int x : y){
                System.out.print(x + "\t");
            }
            System.out.println(" ");
        }
    }
//2Dimensional array
    
}
