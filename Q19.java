class creditCard {
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String description;
    private double balance;
    private double creditLimit;

    public creditCard(String description, double balance, double creditLimit) {
        this.description = description;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void makePayment(double amount) {
        if (amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    public double sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


}
public class Q19 {
    public static void main(String[] args) {
        creditCard card = new creditCard("My Credit Card", 1000.0, 5000.0);
        System.out.println("Credit Card Description: " + card.getDescription());
        System.out.println("Credit Card Balance: " + card.getBalance());
        System.out.println("Credit Card Credit Limit: " + card.getCreditLimit());

        card.setCreditLimit(6000.0);
        System.out.println("Credit Card Credit Limit Updated: " + card.getCreditLimit());

        card.makePayment(-100.0);
        System.out.println("Credit Card Balance After Payment: " + card.getBalance());
    }
}
