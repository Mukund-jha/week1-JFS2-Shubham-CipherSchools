// Assuming You are riding a Bike and police Officer Stops You
//Police Officer Asking you to Provide 2 Details
// Your Current Speed
// If it is your Birthday Today ?

// The Police Officer will Calculate Find Based on following Parameters

// If it is Your Birthday You will waived off (exempted) with
// 5miles/hour

// If it is not your Birthday No Exemption will be Given
// If Your speed is greater than 80 Ticket raised will be 'High Ticket'
// If Your speed is Between 60 and 80 Ticket raised will be 'Mid Ticket'
// If Your speed is below 60 Ticket raised will be No Ticket

//Find the Ticket!!!!
import java.util.*;

public class Test5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed : ");
        int speed = sc.nextInt();

        System.out.println("Today is Your Birthday : ");
        boolean isBirthday = sc.nextBoolean();

        if (isBirthday == true) {
            speed = speed - 5;
        }

        if (speed > 80) {
            System.out.println("High Ticket");
        } else if (speed >= 60) {
            System.out.println("Mid Ticket");
        } else {
            System.out.println("No Ticket");
        }
    }

}
