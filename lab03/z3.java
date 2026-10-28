class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() { return this.owner; }
    public double getBalance() { return this.balance; }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount)
            this.balance -= amount;
    }
};

