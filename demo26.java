public class demo26 {
    public static void main(String[] args) {
        String name = "Jyoti Ranjan Mohanta";
        int result = totalVowels(name);
        System.out.println(result);
        
    }
    static int totalVowels( String str){
        int count = 0;
        char [] arr = str.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(isVowel(arr[i]))
                count = count + 1;
        }
        return count;
    }
    static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        if(ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' && (ch >=65 && ch <=90))
            return true;
        else
            return false;
    }
    
}
//WAP to find number of vowels in astring
