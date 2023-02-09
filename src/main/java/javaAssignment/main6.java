package javaAssignment;


//6. Create a program which will take input from users for registration and save the info
//        to a json file. The system will require following user info:
//        Full Name, email, password, address, mobile no.

import java.io.FileWriter;
import java.util.Scanner;
import org.json.simple.JSONObject;

public class main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        System.out.println("Enter your address: ");
        String address = scan.nextLine();

        System.out.println("Enter your mobile number: ");
        String mobile = scan.nextLine();

        JSONObject userInfo = new JSONObject();
        userInfo.put("name", name);
        userInfo.put("email", email);
        userInfo.put("password", password);
        userInfo.put("address", address);
        userInfo.put("mobile", mobile);

        try {
            FileWriter file = new FileWriter("D:\\Assignment-on-java\\src\\main\\resources\\userinfo.json");
            file.write(userInfo.toJSONString());
            file.flush();
            file.close();
            System.out.println("User information has been saved to userinfo.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}