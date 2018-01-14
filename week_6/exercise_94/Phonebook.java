import java.util.ArrayList;

// Ideally you should define an interface for this and have this class implement that.
public class Phonebook {
    // Avoid storing specific implementations. Use interface List<Person>.
    // This should be marked final. Not doing so will affect visibility of the reference to different threads.
    // A better name for this variable will be "people".
    private ArrayList<Person> persons;
    
    public Phonebook() {
        // You can simply write this as new ArrayList<>()
        this.persons = new ArrayList<Person>();
    }
    
    // This allows you to put same person multiple times which is something you are not supporting while returning.
    // Using a Map will solve that too.
    // Also since ArrayList<> implementation (and also HashMap<>) is not thread safe, you might run into situations where different threads will
    // see this list or map differently. This can be avoided by either 1) using ConcurrentHashMap instead of regular HashMap.
    // 2) Using SynchronizedHashMap 3) synchronizing this method by yourself.
    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        this.persons.add(newPerson);
    }
    
    // This is pretty useless and should be removed. Other than logging, this console printing has no place in real world.
    // Just override the toString of this class to return a string representation that your clients can log if they want to.
    public void printAll() {
        for (Person person : this.persons) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name) {
        // O(n) search like this should be punishable by law lol.
        // Use a map instead of list to store this state which will make it much faster.
        for (Person person : this.persons) {
            // You are not checking for nulls anywhere so #getName() can return null which will result in NullPointerException,
            // the most embarrassing of all exceptions
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        // Returning a string like this is hard to understand on the client side.
        // Right way to handle this is either return an empty Optional<String> or throwing an excpeption.
        return "number not known";
    }
}
