// User-defined Checked Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// User-defined Unchecked Exception
class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class exception {
    


    // Method that throws Checked Exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("Valid Age: " + age);
        }
    }

    // Method that throws Unchecked Exception
    public static void checkNumber(int num) {
        if (num < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed!");
        } else {
            System.out.println("Valid Number: " + num);
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15); // Throws Checked Exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        try {
            checkNumber(-10); // Throws Unchecked Exception
        } catch (NegativeNumberException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

