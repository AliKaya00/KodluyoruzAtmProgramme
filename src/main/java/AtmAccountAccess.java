import java.sql.SQLOutput;
import java.util.Scanner;

public class AtmAccountAccess {

    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        int balance= 1500;
        int select;

        int right = 3;
        while ( right > 0) {
            System.out.println("Insert your username: ");
            username = scanner.nextLine();
            System.out.println("Insert your password: ");
            password = scanner.nextLine();
            if (username.equals("patika") && password.equals("123")) {
                System.out.println("Welcome to bank!");
                do {
                    System.out.println("1-Cash Deposit\n" +
                            "2-Money Withdraw\n" +
                            "3-Cash Limit\n" +
                            "4-Exit");
                    System.out.print("Please select your operation : ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Your Cash : ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Your Cash : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient Cash");
                            } else {
                                balance -= price;
                                break;

                            }
                        case 3:
                            System.out.println("Your Cash : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you soon");
                break;
            } else {
                right--;
                System.out.println("Invalid username or password, try again");
                if (right == 0) {
                    System.out.println("Your account is blocked. Please contact your bank.");
                } else {
                    System.out.println("Your right : " + right);


                }


            }
        }
    }
}

