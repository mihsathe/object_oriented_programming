public class Main {
    
    public static void main(String[] args) {
        LyyraCard lyyraCardForUserPekka = new LyyraCard(20);
        LyyraCard lyyraCardForUserBrian = new LyyraCard(30);
        
        lyyraCardForUserPekka.payGourmet();
        
        lyyraCardForUserBrian.payEconomical();
        
        System.out.println("Pekka: " + lyyraCardForUserPekka);
        System.out.println("Brian: " + lyyraCardForUserBrian);
        
        lyyraCardForUserPekka.loadMoney(20);
        
        lyyraCardForUserBrian.payGourmet();
        
        System.out.println("Pekka: " + lyyraCardForUserPekka);
        System.out.println("Brian: " + lyyraCardForUserBrian);
        
        lyyraCardForUserPekka.payEconomical();
        lyyraCardForUserPekka.payEconomical();
        
        lyyraCardForUserBrian.loadMoney(50);
        
        System.out.println("Pekka: " + lyyraCardForUserPekka);
        System.out.println("Brian: " + lyyraCardForUserBrian);
    }
}