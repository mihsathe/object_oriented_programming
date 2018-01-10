public class CashRegister {
    
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    
    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }
    
    public double payEconomical(double cashGiven) {
        double economicalLunchPrice = 2.5;
        
        if (economicalLunchPrice <= cashGiven) {
            this.cashInRegister += economicalLunchPrice;
            this.economicalSold++;
            return cashGiven - economicalLunchPrice;
        }
        
        return cashGiven;
    }
    
    public boolean payEconomical(LyyraCard cardObject) {
        double economicalLunchPrice = 2.5;
        double userBalance = cardObject.balance();
        
        if (economicalLunchPrice <= userBalance) {
            cardObject.pay(economicalLunchPrice);
            this.economicalSold++;
            return true;
        }
        
        return false;
    }
    
    public double payGourmet(double cashGiven) {
        double gourmetLunchPrice = 4;
        
        if (gourmetLunchPrice <= cashGiven) {
            this.cashInRegister += gourmetLunchPrice;
            this.gourmetSold++;
            return cashGiven - gourmetLunchPrice;
        }
        
        return cashGiven;
    }
    
    public boolean payGourmet(LyyraCard card) {
        double gourmetLunchPrice = 4;
        double userBalance = card.balance();
        
        if (gourmetLunchPrice <= userBalance) {
            card.pay(gourmetLunchPrice);
            this.gourmetSold++;
            return true;
        }
        
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
    
    public String toString() {
        return "money in register " + this.cashInRegister + " economical lunches sold: " + this.economicalSold + " gourmet lunches sold: " + this.gourmetSold;
    }
}