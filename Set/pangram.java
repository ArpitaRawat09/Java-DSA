package Set;

import java.util.HashSet;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        String str = "qwertyuioplkjhgfdsazxcvbnmm";
        Set<String> set = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            set.add("" + str.charAt(i));   
        }

        if(set.size() == 26){
            System.out.println("Pangram");
        }else{
            System.out.println("Not Pangram");
        }

    }
    
}
