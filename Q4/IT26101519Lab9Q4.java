import java.util.Scanner;

public class IT26101519Lab9Q4 {

    public static double calcFinalMark(double a, double e) {
        return a * 0.3 + e * 0.7;
    }

    public static String findGrades(double m) {
        if (m >= 75) return "A";
        else if (m >= 60) return "B";
        else if (m >= 50) return "C";
        else return "F";
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-12s %-15.2f %s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double aMark = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double eMark = sc.nextDouble();
            sc.nextLine();

            finalMarks[i] = calcFinalMark(aMark, eMark);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }

        System.out.printf("%-12s %-15s %s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        sc.close();
    }
}

