import java.util.Random;

public class PasswordRandomizer {
    
    private int passwordLength;
    private Random random;
    private String alphabets = "abcdefghijklmnopqrstuvwxyz";
    
    public PasswordRandomizer(int passwordLength) {
        this.passwordLength = passwordLength;
        random = new Random();
    }
    
    public String createPassword() {
        int counter = 0;
        int alphabetsPosition;
        String newPassword = "";
                
        while (counter < this.passwordLength) {
            alphabetsPosition = random.nextInt(alphabets.length());
            newPassword += alphabets.charAt(alphabetsPosition);
            counter++;
        }
        
        return newPassword;
    }
}