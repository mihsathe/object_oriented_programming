public class Accounts {
    
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
    
    public static void main(String[] args) {
        Account userA = new Account("A", 100.0);
        Account userB = new Account("B", 0);
        Account userC = new Account("C", 0);
        
        transfer(userA, userB, 50.0);
        transfer(userB, userC, 25.0);
    }
}