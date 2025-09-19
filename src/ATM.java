class ATM {
    private double accountBalance;

    public ATM(double initialBalance) {
        this.accountBalance = initialBalance;
    }


    public void deposit(int amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Cash deposit successful!");
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + String.format("%.2f", accountBalance));
        } else {
            System.out.println("Invalid cash amount. Please enter a positive value.");
        }
        System.out.println();
    }

    public void deposit(String checkNumber, int amount) {
        if (amount > 0 && checkNumber != null && !checkNumber.trim().isEmpty()) {
            accountBalance += amount;
            System.out.println("Check deposit successful!");
            System.out.println("Check Number: " + checkNumber);
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + String.format("%.2f", accountBalance));
        } else {
            System.out.println("Invalid check deposit. Please provide valid check number and amount.");
        }
        System.out.println();
    }


    public void deposit(String phoneNumber, double amount) {
        if (amount > 0 && phoneNumber != null && !phoneNumber.trim().isEmpty()) {
            accountBalance += amount;
            System.out.println("Mobile transfer deposit successful!");
            System.out.println("From phone: " + phoneNumber);
            System.out.println("Deposited: $" + String.format("%.2f", amount));
            System.out.println("New balance: $" + String.format("%.2f", accountBalance));
        } else {
            System.out.println("Invalid mobile transfer. Please provide valid phone number and amount.");
        }
        System.out.println();
    }


    public void checkBalance() {
        System.out.println("Current account balance: $" + String.format("%.2f", accountBalance));
        System.out.println();
    }
}