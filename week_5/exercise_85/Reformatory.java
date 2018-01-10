public class Reformatory {
    
    private int countWeightMeasured = 0;
    
    public int weight(Person personObject) {
        this.countWeightMeasured++;
        return personObject.getWeight();
    }
    
    public void feed(Person personObject) {
        personObject.setWeight(weight(personObject) + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.countWeightMeasured;
    }
}