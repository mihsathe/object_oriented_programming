public class Program {
    
    public static void main(String[] args) {
        PasswordRandomizer testPassword = new PasswordRandomizer(8);
        
        System.out.println(testPassword.createPassword());
    }
}