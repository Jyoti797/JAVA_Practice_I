public class demo27 {
    public static void main(String[] args) {
        String name = "Jyoti Ranjan Mohanta";
        int result = totalConsonants(name);
        System.out.println(result);
     
    }
    static int totalConsonants( String str){
        int count = 0;
        char [] arr = str.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(isConsonant(arr[i]))
                count = count + 1;
        }
        return count;
    }
    static boolean isConsonant(char ch){
        ch = Character.toUpperCase(ch);
        if(ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' && (ch >=65 && ch <=90))
            return false;
        else
            return true;
    }
}
//WAP to calculate total number of consonants in astring
