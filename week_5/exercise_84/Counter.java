public class Counter {
    
    private int startingValue;
    private boolean checkIfValueBelowZero;
    
    public Counter() {
        this(0, false);
    }
    
    public Counter(int startingValue, boolean checkIfValueBelowZero) {
        this.startingValue = startingValue;
        this.checkIfValueBelowZero = checkIfValueBelowZero;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean checkIfValueBelowZero) {
        this(0, checkIfValueBelowZero);
    }
    
    public int value() {
        return this.startingValue;
    }
    
    public void increase() {
        this.startingValue++;
    }
    
    public void decrease() {
        
        if (this.checkIfValueBelowZero && this.startingValue == 0) {
            this.startingValue = 0;
        } else {
            this.startingValue--;
        }
    }
    
    public void increase(int increaseAmount) {
        if (!(increaseAmount < 0)) {
            this.startingValue += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (!(decreaseAmount < 0)) {
            this.startingValue -= decreaseAmount;
        
            if (this.checkIfValueBelowZero && this.startingValue < 0) {
                this.startingValue = 0;
            }
        }
    }
    
}