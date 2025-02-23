import java.util.*;

public class RandomPasswordGenerator {
    
    
    public static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecialChars) {
        
        String  numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*";

        
        StringBuilder allChars = new StringBuilder();
        if (includeNumbers) allChars.append(numbers);
        if (includeLowercase) allChars.append(lowercase);
        if (includeUppercase) allChars.append(uppercase);
        if (includeSpecialChars) allChars.append(specialChars);
        
        
        if (allChars.length() == 0) {
            return "No characters selected!";
        }
        
        
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }
        
        return password.toString();
    }

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        
        System.out.print("Enter the length of password: ");
        int length = Sc.nextInt();

        
        System.out.print("Include numbers (true/false): ");
        boolean includeNumbers = Sc.nextBoolean();
        
        System.out.print("Include lowercase letters (true/false): ");
        boolean includeLowercase = Sc.nextBoolean();
        
        System.out.print("Include uppercase letters (true/false): ");
        boolean includeUppercase = Sc.nextBoolean();
        
        System.out.print("Include special characters (true/false): ");
        boolean includeSpecialChars = Sc.nextBoolean();

        
        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialChars);

        
        System.out.println("Generated password is : " + password);

    
        Sc.close();
    }
}

