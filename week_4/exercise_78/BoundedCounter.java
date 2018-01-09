public class BoundedCounter {
    
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimitAtStart) {
        this.value = 0;
        this.upperLimit = upperLimitAtStart;
    }
    
    public void next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() {
        if (this.value >= 10) {
            return "" + this.value;
        } else {
            return "0" + this.value;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int userInputValue) {
        if ((userInputValue >= 0) && (userInputValue <= this.upperLimit)) {
            this.value = userInputValue;
        } 
    }
}