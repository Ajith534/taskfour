package taskfour;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter. Age must be 18 or older.");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
 @Override
    public String toString() {
        return "Voter ID: " + voterId +
                ", Name: " + name +
                ", Age: " + age;
    }
}

public class VoterTest {
    public static void main(String[] args) {
        try {
           
            Voter validVoter = new Voter(1, "John Doe", 20);
            System.out.println("Voter Information:\n" + validVoter);

           
            Voter invalidAgeVoter = new Voter(2, "Jane Smith", 16);
            System.out.println("Voter Information:\n" + invalidAgeVoter);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
