public class demo21 {
    public static void main(String[] args) {
        String original = "MADAM";
        String rev = ultaString(original);
        if(original.equals(rev)){
            System.out.println("This is a PALLINDROME STRING");
        }else{
            System.out.println("This is NOT a PALLINDROME String");
        }
    }
      static String ultaString(String str){
        String y = "";
        for(int i = str.length()-1; i>=0; i--){
            y = y + str.charAt(i);
        }
        return y;
    }
    
}
