class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", new balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(200);
        try {
            account.withdraw(50);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(account.getBalance());
        }
    }
}
