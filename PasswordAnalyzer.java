public class PasswordAnalyzer {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        analyzePassword(password); // Call to the separate method
    }

    public static void analyzePassword(String password) {
        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        int score = 0;
        if (length >= 8) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        String strength;
        if (score == 5) strength = "Strong";
        else if (score >= 3) strength = "Moderate";
        else strength = "Weak";

        System.out.println("\nPassword Analysis:");
        System.out.println("Length: " + length);
        System.out.println("Has Uppercase: " + hasUpper);
        System.out.println("Has Lowercase: " + hasLower);
        System.out.println("Has Digit: " + hasDigit);
        System.out.println("Has Special Character: " + hasSpecial);
        System.out.println("Strength: " + strength);
    }
}