class BankAccount{
    int balanceAmount;
    BankAccount() {}
    BankAccount(int initialBalance)
    {
        balanceAmount=initialBalance;
    }
    void printBankBalance()
    {
        System.out.println("Your current Bank Balance is: " + balanceAmount);
    }
}
class Example5 {
    public static void main(String[] args)
    {
        BankAccount account1= new BankAccount(500);
        account1.printBankBalance();
        BankAccount account2= new BankAccount();
        account2.printBankBalance();

    }
}
