public class LyyraCard {
    
    private double remainingBalance;
    
    public LyyraCard(double balanceAtStart) {
        this.remainingBalance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + this.remainingBalance + " euros";
    }
    
    public void payEconomical() {
        if (this.remainingBalance >= 2.5) {
            this.remainingBalance -= 2.50;
        }
    }
    
    public void payGourmet() {
        if (this.remainingBalance >= 4) {
            this.remainingBalance -= 4.00;
        }
    }
    
    public void loadMoney(double amount) {
        if ((this.remainingBalance + amount) > 150) {
            this.remainingBalance = 150;
        } else if (amount > 0) {
            this.remainingBalance += amount;
        }
    }
}