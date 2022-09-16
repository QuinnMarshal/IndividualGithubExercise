import java.util.Scanner;

public class RevereseString {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        System.out.println(reverse(sentence));

        TestReverse();
    }

    public static String reverse(String input){
        Scanner scan = new Scanner(input);
        String next = scan.next();
        if(scan.hasNext()){
            String nextInput = "";
            while(scan.hasNext()){
                nextInput += scan.next() + " ";
            }
            return reverse(nextInput) + " " + next;
        }
        else return next;
    }

    public static void TestReverse(){

        String testString = "This is a test sentence";

        if(reverse(testString).equals("sentence test a is This")){
            System.out.println("Test passed!");
        }
        else
         System.out.println("Test failed :(");

    }
    
}
