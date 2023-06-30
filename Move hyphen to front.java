import java.util.*;
public class shiftstring {
    public static void shift(char str[]){
        int i = str.length-1;
        for(int j=i; j>=0; j--){
            if(str[j] != '-'){
                char c = str[i];
                str[i]=str[j];
                str[j]=c;
                i--;
            }
        }
    }
    public static void main(String[] args){
        char str[]="he-l-lo".toCharArray();
        shift(str);
        System.out.println(String.valueOf(str));
    }
}
//*****************Second Approach************
public class binary_String {
    public static void stringArrangement(String str){
        int count = 0;
        String res = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isLetter(ch)){
                count++;
            }
        }
        for(int i=0; i<count; i++){
            res+='_';
        }
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String str = "He-llo-Wo-rl-d";

        stringArrangement(str);
    }
}
