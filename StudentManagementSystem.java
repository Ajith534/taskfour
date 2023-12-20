package taskfour;
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;

        
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        
        if (!isValidName(name)) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }

        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name) {
        
        return name.matches("[a-zA-Z]+");
    }

  
    @Override
    public String toString() {
        return "Roll No: " + rollNo +
                ", Name: " + name +
                ", Age: " + age +
                ", Course: " + course;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
           
            Student validStudent = new Student(1, "John Doe", 20, "Computer Science");
            System.out.println("Student Information:\n" + validStudent);

            Student invalidAgeStudent = new Student(2, "Jane Smith", 22, "Physics");
            System.out.println("Student Information:\n" + invalidAgeStudent);

        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
