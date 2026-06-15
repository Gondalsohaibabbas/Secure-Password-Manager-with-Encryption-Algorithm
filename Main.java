import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Hash hashing = new Hash();
        String pass;
        AuthSecure check;

        // Login screen
        do{
            System.out.println("=======================================================");
            System.out.println("+  Secure Password Manager with Encryption Algorithm  +");
            System.out.println("=======================================================\n");

            System.out.println("Enter your Master Password :");
            pass = input.nextLine();

            check = new AuthSecure(pass);
            boolean isTrue = check.verification();

            if(isTrue){
                System.out.println("Login successful!");
            }

            if(!isTrue)
                System.out.println("Password is wrong. Try Again!");

        }while(!check.verification());

        // Main menu
        while(true) {
            System.out.println("===========================");
            System.out.println("+         Main Menu       +");
            System.out.println("===========================");
            System.out.println("1. Add Password");
            System.out.println("2. Search Password");
            System.out.println("3. Delete Password");
            System.out.println("4. Update Password");
            System.out.println("5. Display All Passwords");
            System.out.println("6. Exit\n");

            System.out.println("Enter your choice :");
            int num = input.nextInt();

            if (num == 1) {
                System.out.println("Enter Website Name :");
                input.nextLine();

                String webName = input.nextLine();

                System.out.println("Enter Username :");
                String userName = input.nextLine();

                System.out.println("Enter Password :");
                String password = input.nextLine();

                hashing.insert(webName, userName, password);

            }

            if (num == 2) {
                input.nextLine();

                System.out.println("Enter Website Name :");
                String web = input.nextLine();

                String info = hashing.search(web);

                System.out.println(info);

            }

            if (num == 3) {
                input.nextLine();

                System.out.println("Enter Website Name :");
                String web = input.nextLine();
                System.out.println("Enter userName :");
                String user = input.nextLine();

                hashing.delete(web,user);

            }

            if (num == 4) {
                input.nextLine();
                System.out.println("Enter Website Name :");
                String web = input.nextLine();
                System.out.println("Enter userName Name :");
                String user = input.nextLine();
                hashing.update(web,user);
            }

            if (num == 5) {
                // Display all records in sorted order
                hashing.displaySorted();
            }

            if (num == 6) {
                System.out.println("GoodBye!");
                break;
            }
        }
    }
}
