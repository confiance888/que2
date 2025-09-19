
public class Main {
    public class ATMMain {
        public static void main(String[] args) {

            ATM myATM = new ATM(1000.00);

            System.out.println("=== Welcome to ATM Service ===\n");

            System.out.println("Initial Balance:");
            myATM.checkBalance();




            System.out.println("=== Cash Deposit ===");
            myATM.deposit(500);

            // 2. Check deposit
            System.out.println("=== Check Deposit ===");
            myATM.deposit("CHK12345", 750);

            // 3. Mobile transfer deposit
            System.out.println("=== Mobile Transfer Deposit ===");
            myATM.deposit("+1-555-123-4567", 250.75);

            // Final balance check
            System.out.println("=== Final Balance ===");
            myATM.checkBalance();

            // Test error cases
            System.out.println("=== Testing Error Cases ===");
            myATM.deposit(-100); // Invalid cash amount
            myATM.deposit("", 200); // Invalid check number
            myATM.deposit("", -50.0); // Invalid mobile transfer
        }
    } {


            ATM myATM = new ATM(1000.00);

            System.out.println("=== Welcome to ATM Service ===\n");


            System.out.println("Initial Balance:");
            myATM.checkBalance();



            System.out.println("=== Cash Deposit ===");
            myATM.deposit(500);


            System.out.println("=== Check Deposit ===");
            myATM.deposit("CHK12345", 750);


            System.out.println("=== Mobile Transfer Deposit ===");
            myATM.deposit("+1-555-123-4567", 250.75);


            System.out.println("=== Final Balance ===");
            myATM.checkBalance();


            System.out.println("=== Testing Error Cases ===");
            myATM.deposit(-100); // Invalid cash amount
            myATM.deposit("", 200); // Invalid check number
            myATM.deposit("", -50.0); // Invalid mobile transfer
        }
    }

