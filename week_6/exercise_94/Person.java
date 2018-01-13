public class Person {
    
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
    
    public void changeNumber(String number) {
        this.personNumber = number;
    }
    
    public String toString() {
        return this.personName + " number: " + this.personNumber;
    }
}