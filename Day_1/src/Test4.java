// Title: How long is Your BURRRRRP?
// Ask the user to enter an Integer (burp Length) 
// Depending on the input Provided 'Burp' will be Produced.

//For Example;
// 5 : 'Burrrrrp'
// 25 : 'Burrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrp'
// Input can be any Random Number
import java.util.*;

public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Long is Your Burp ?");

        int burpLength = sc.nextInt();
        String msg = "";
        for (int i = 1; i <= burpLength; i++) {
            msg = msg + "r";
        }
        System.out.println("Bu" + msg + "p");
    }

}
