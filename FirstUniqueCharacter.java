import java.util.*;
public class FirstUniqueCharacter {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        system.out.println(nano(str));
    }
    static int nano(String str){
        int [] freq=new int[26];
        char chars[]=str.toCharArray();
        for(char c: chars){
            freq[c-'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}