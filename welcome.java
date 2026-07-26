import java.util.Scanner;
public class welcome {
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name:");
       String name1 = scanner.nextLine();

       System.out.print ("Enter the second name:");
        String name2 = scanner.nextLine();
      
       System.out.println ("Welcome to the second year" + " " +  name1 + " " + name2);
  }
}  
