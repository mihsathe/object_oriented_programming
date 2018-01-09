public class Product {
    
    private double productPrice;
    private int productAmount;
    private String productName;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.productName = nameAtStart;
        this.productPrice = priceAtStart;
        this.productAmount = amountAtStart;    
    }
    
    public void printProduct() {
            System.out.println(this.productName + ", price " + this.productPrice + ", amount " + this.productAmount);
        }
}