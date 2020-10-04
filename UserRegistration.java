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
        System.out.println("Enter the Email Id: ");
        String email = sc.next();
        while(!Pattern.matches("^[A-Za-z0-9]+(\\.[A-Za-z0-9-]+)?@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$",email)){
            System.out.println("Ivalid input. Enter again: ");
            email = sc.next();
        }

        System.out.println("Enter the Phone Number: ");
        sc.nextLine();
        String phone = sc.nextLine();
        while(!Pattern.matches("[0-9]{2}[ ][0-9]{10}",phone)){
            System.out.println("Ivalid input. Enter again: ");
            phone = sc.nextLine();
        }

        System.out.println("Enter the Password: ");
        String password = sc.next();
        while(!Pattern.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%_][0-9a-zA-Z]*",password)){
            System.out.println("Ivalid input. Enter again: ");
            password = sc.nextLine();
        }



    }
}