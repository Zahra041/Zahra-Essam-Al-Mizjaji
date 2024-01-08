class CreditCard {
        private double balance;

        public CreditCard(double balance) {
            this.balance = balance;
        }

        public void makePayment(double amount) throws IllegalArgumentException {
            if (amount < 0) {
                throw new IllegalArgumentException("Negative Amount is not Allowed");
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            CreditCard card = new CreditCard(1000.0);

            System.out.println("Initial balance: $" + card.getBalance());

            try {
                card.makePayment(500.0);
                System.out.println("Payment of $500.0 made successfully.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("New balance: $" + card.getBalance());

            try {
                card.makePayment(-200.0);
                System.out.println("Payment of -$200.0 made successfully.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Final balance: $" + card.getBalance());
        }
    }



