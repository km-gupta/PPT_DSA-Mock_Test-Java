import java.util.Scanner;

public class FirstUniqueCharacter {

    private static String takeString() {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    private static int checkRepeatChar(String s) {
        int[] charCount = new int[26];

        //count occurance
        for(int i=0; i<s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        //find first occurance
        for(int i=0; i<s.length(); i++) {
            if(charCount[s.charAt(i) - 'a'] == 1) 
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = takeString();
        int idx = checkRepeatChar(s);
        System.out.print("Index of the non-repeating character is "+idx);
    }
    

    
}
