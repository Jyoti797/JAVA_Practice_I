public class demo25 {
    public static void main(String[] args) {
       for(int range = 100; range <=300; range++){
        if(isPallindrome(range)){
            System.out.println(range);
        }        
     }
    }
    static boolean isPallindrome (int num){
        int original = num;
        String str = String.valueOf(num);
        String olta = ultaString(str);
        int rev = Integer.parseInt(olta);
        if(rev==original)
            return true;
        else
            return false;      
    }
   static  String ultaString(String str){
    String result = "";
        char [] arr = str.toCharArray();
        for(int i = arr.length-1; i>=0; i--){
            result = result + arr[i];
        }
        return result;
    }
    
}
//find pallindrome numbers between 100 and 300
