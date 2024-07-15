import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Create arrays to store grades
        int[] grades = new int[numStudents];

        // Input grades from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        // Calculate average, highest, and lowest grades
        double average = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        // Display results
        System.out.println("\nGrade Analysis:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        
    }

    // Method to calculate average grade
    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to find the highest grade
    public static int findHighest(int[] grades) {
        if (grades.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    // Method to find the lowest grade
    public static int findLowest(int[] grades) {
        if (grades.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
}
