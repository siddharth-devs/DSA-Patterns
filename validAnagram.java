import java.util.*;
public class validAnagram {
    public static boolean validAnagram(String s, String t){
        if(s.length()!=t.length()) return false;

        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;

        }

        for(int num : count){
            if(num!=0){
                return false;
            }
        }
        return true;

        /* Simple Logic------>
        
        if(s.length()!=t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
        */

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(validAnagram(s, t));
    }
    
}
