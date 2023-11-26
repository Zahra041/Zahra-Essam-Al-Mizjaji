class CreditCard {
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "description='" + description + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                '}';
    }

    private String description;
    private double balance;
    private double creditLimit;

    public CreditCard(String description, double balance, double creditLimit) {
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

    public double sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
public class Q18 {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("My Credit Card", 1000.0, 5000.0);
        System.out.println("Credit Card Description: " + card.getDescription());
        System.out.println("Credit Card Balance: " + card.getBalance());
        System.out.println("Credit Card Credit Limit: " + card.getCreditLimit());

        card.setCreditLimit(6000.0);
        System.out.println("Credit Card Credit Limit Updated: " + card.getCreditLimit());
    }
}


