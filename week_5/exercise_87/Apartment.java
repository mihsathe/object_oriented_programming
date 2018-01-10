public class Apartment {
    
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment compared) {
        if (this.squareMeters > compared.squareMeters) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int calculatePriceForThisApartment = this.squareMeters * this.pricePerSquareMeter; 
        int calculatePriceForOtherApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        return Math.abs(calculatePriceForThisApartment - calculatePriceForOtherApartment);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int calculatePriceForThisApartment = this.squareMeters * this.pricePerSquareMeter; 
        int calculatePriceForOtherApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if (calculatePriceForThisApartment > calculatePriceForOtherApartment) {
            return true;
        }
        return false;
    }
}