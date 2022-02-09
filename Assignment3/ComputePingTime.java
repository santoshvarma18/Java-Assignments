package Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ComputePingTime {
    public static void pingIP(String command) {

        try {
            // creating the sub process, execute system command
            Process p = Runtime.getRuntime().exec(command);
            // reads the output
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        String ip = sc.nextLine();
        pingIP("ping " + ip);
        
    }
}
