package taskfour;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeSystem {
    private static Map<String, Integer> studentGrades = new HashMap<>();

    public static void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student '" + name + "' added with grade: " + grade);
    }

    public static void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student '" + name + "' removed.");
        } else {
            System.out.println("Student '" + name + "' not found.");
        }
    }

    public static void displayStudentGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println("Grade of '" + name + "': " + grade);
        } else {
            System.out.println("Student '" + name + "' not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        addStudent("ajith", 85);
        addStudent("sujith", 92);

        System.out.print("Enter a student name to display their grade: ");
        String studentName = scanner.nextLine();
        displayStudentGrade(studentName);

        System.out.print("Enter a student name to remove: ");
        studentName = scanner.nextLine();
        removeStudent(studentName);
        System.out.print("Enter a new student name: ");
        String newStudentName = scanner.nextLine();
        System.out.print("Enter the grade for " + newStudentName + ": ");
        int newStudentGrade = scanner.nextInt();
        addStudent(newStudentName, newStudentGrade);
        System.out.println("\nAll Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

