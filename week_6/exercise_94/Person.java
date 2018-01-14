public class Person {
    // These are not final and there's a method to update one of these.
    // This means this class is not ThreadSafe
    private String personName;
    private String personNumber;
    
    public Person(String name, String number) {
        this.personName = name;
        this.personNumber = number;
    }
    
    public String getName() {
        return this.personName;
    }
    
    public String getNumber() {
        return this.personNumber;
    }
    // set* is the general convention. Try to avoid this sort of mutability methods unless absolutely needed.
    public void changeNumber(String number) {
        this.personNumber = number;
    }
    // String.format() is more readable
    public String toString() {
        return this.personName + " number: " + this.personNumber;
    }
}
