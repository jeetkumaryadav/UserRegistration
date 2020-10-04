import java.util.*;
import java.util.regex.*;

public class UserRegistration{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        while(!Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName)){
            System.out.println("Ivalid input. Enter again: ");
            firstName = sc.next();
        }

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        while(!Pattern.matches("[A-Z]{1}[a-z]{2,}",lastName)){
            System.out.println("Ivalid input. Enter again: ");
            lastName = sc.next();
        }

    }
}