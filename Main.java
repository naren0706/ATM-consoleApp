import java.util.HashMap;
import java.util.Scanner;

class Main {

    
    static Scanner sc=new Scanner(System.in);

    static String adminName = "Naren";
    static String adminPassword = "suren";

    static HashMap<String, String> userNamePassword = new HashMap<>();
    static HashMap<String, Integer> userNameBalance = new HashMap<>();

    

    public static void main(String[] args)
    {
        index();
    }

    private static void index() {

        
        int choice;

        do {
            System.out.println("1.admin");
            System.out.println("2.User");
            System.out.println("3.exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    admin();
                    break;

                case 2:
                    user();
                    break;

                case 3:
                    System.out.println("-------------------------------------------------------exit-------------------------------------------------------");
                    break;
            
                default:
                    break;

            }

        } while (choice!=3);

    }
    
    
    private static void admin()
    {

        System.out.print("Enter Admin Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter Admin Password:");
        String inputAdminPassword = sc.next();
        if(adminName.equals(inputAdminName) & adminPassword.equals(inputAdminPassword))
        {
            int choice;
            do
            {
            System.out.println("1.Change admin name");
            System.out.println("2.Change admin Password");
            System.out.println("3.newUser");
            System.out.println("4.go back");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    changeAdminName();
                    break;

                case 2:
                    changeAdminPassword();
                    break;
                case 3:
                    newUser();
                    break;
                case 4:
                    exit();
                    break;
                    
                default:
                    break;
            }

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

            }while(choice!=4);
        }
        else
        {
            System.out.println("Try again,Invalid User name or Password");
        }

    }


    private static void exit() {
        System.out.println("------------------------------------------------------------exit----------------------------------------------------------------------");
    }

    private static void changeAdminName()
    {
        System.out.print("Enter old Admin Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter old Admin Password:");
        String inputAdminPassword = sc.next();
        if(adminName.equals(inputAdminName) & adminPassword.equals(inputAdminPassword))
        {
            System.out.println("Enter the new Admin name");
            adminName = sc.next();
        }
        else
        {
            System.out.println("Try again,Invalid User name or Password");
        }

        
    }


    private static void changeAdminPassword()
    {

        System.out.print("Enter old Admin Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter old Admin Password:");
        String inputAdminPassword = sc.next();
        if(adminName.equals(inputAdminName) & adminPassword.equals(inputAdminPassword))
        {
            System.out.println("Enter the new Admin password");
            adminPassword = sc.next();
        }
        else
        {
            System.out.println("Try again,Invalid User name or Password");
        }

    }

    private static void newUser()
    {

        System.out.print("Enter the name : ");
        String name = sc.next();
        System.out.print("Enter the Password : ");
        String password = sc.next();
        System.out.print("Enter the balance : ");
        int balance = sc.nextInt();


        userNamePassword.put(name,password);
        userNameBalance.put(name,balance);

        System.out.println("Account created");
    }

    private static void user()
    {
        int choice;
        do {
            System.out.println("1.Change Password");
            System.out.println("2.Check Balance");
            System.out.println("3.Deposite Amount");
            System.out.println("4.Withdraw Amount");
            System.out.println("5.exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    changeUserPassword();
                    break;
                case 2:
                    checkBalance();
                    break;
                case 3:
                    depositAmount();
                    break;
                case 4:
                    withdrawAmount();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    break;
            }
            
        } while (choice!=3);
    }

    private static void changeUserPassword() {

        System.out.println("Enter old User name");
        String inputUserName = sc.next();
        System.out.println("Enter old Password");
        String inputUserPassword = sc.next();
        if((userNamePassword.get(inputUserName)).equals(inputUserPassword) )
        {
    
