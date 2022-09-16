import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfOccurrences{

    public static void main(String[] args) {
        
        System.out.println("Enter a String you desire");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("The string has " + count(s) + " unique letters!");
    }

    public static int count(String s){
        ArrayList<Character> chars = new ArrayList<Character>();
        return count(s, chars, s.length()-1);
    }

    public static int count(String s, ArrayList<Character> chars, int high){

        if(high >= 0){
            char c = s.charAt(high);
            if(Character.isAlphabetic(c))
                if(!chars.contains(Character.toLowerCase(c)))
                    chars.add(Character.toLowerCase(c));
            return count(s, chars, high-1);
        }else 
            return chars.size();
    }

    public static String TestOccurrences(){

        String s = "This is a test string";

        if(count(s) == 9){
            return "Test passed!";
        }
        else
            return "Test failed";
    }
}




    



