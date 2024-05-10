public class demo28 {
    public static void main(String[] args) {
        String str = "@@@@#$%^&*";
        int result = totalSpecialChar(str);
        System.out.println(result);

    }

    static int totalSpecialChar(String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (isSpecialChar(arr[i]))
                count = count + 1;
        }
        return count;
    }

    static boolean isSpecialChar(char ch) {
        if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126))
            return true;
        else
            return false;
    }

}
// WAP to find out total number of special charcters in a string