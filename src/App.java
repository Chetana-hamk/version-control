import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
        System.out.println("What is your favourite colour?");
        String name = in.nextLine();;

        if(name.equals(""))
        {
            System.out.println("Error");
   
        } 
        else
{
         String purple = "Purple";
        System.err.println("My favourite colour is " + purple + ".");
}}
    }
