import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student stu[] = new Student[n];
        Internals inMarks[] = new Internals[n];
        External exMarks[] = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            stu[i] = new Student(usn, name, sem);

            int im[] = new int[5];
            System.out.println("Enter 5 Internal Marks:");
            for (int j = 0; j < 5; j++)
                im[j] = sc.nextInt();
            inMarks[i] = new Internals(im);

            int sm[] = new int[5];
            System.out.println("Enter 5 SEE Marks:");
            for (int j = 0; j < 5; j++)
                sm[j] = sc.nextInt();
            exMarks[i] = new External(usn, name, sem, sm);
        }

        System.out.println("\n----- FINAL MARKS -----\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Student: " + stu[i].name + " | USN: " + stu[i].usn);
            System.out.println("Course\tCIE\tSEE/2\tFinal");

            for (int j = 0; j < 5; j++) {
                int cie = inMarks[i].internalMarks[j];
                int see = exMarks[i].seeMarks[j] / 2; // SEE is out of 100 → convert to 50
                int finalMarks = cie + see;

                System.out.println((j + 1) + "\t" + cie + "\t" + see + "\t" + finalMarks);
            }

            System.out.println();
        }

        sc.close();
    }
}