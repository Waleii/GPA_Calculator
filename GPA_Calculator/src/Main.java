import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many courses: ");
        int noOfCourses = input.nextInt(), index = 0;
        CourseInfo [] data = new CourseInfo[noOfCourses];

        while (index < noOfCourses)
        {
            try {
                CourseInfo course = new CourseInfo();

                input = new Scanner(System.in);
                System.out.printf("Entry: %d\n", index + 1);
                System.out.printf("Enter the course %d name & code: ", index + 1);
                course.setCourseCode(input.nextLine());

                input = new Scanner(System.in);
                System.out.print("Enter the course unit (positive integers only): ");
                int unit = input.nextInt();
                if (unit < 0) {
                    throw new Exception();
                }
                course.setCourseUnit(unit);

                input = new Scanner(System.in);
                System.out.print("Enter the course grade: ");
                String [] gradeOptions = {"A", "B", "C", "D", "E", "F"};
                String grade = input.next().toUpperCase();
                if (Arrays.asList(gradeOptions).contains(grade)) {
                    course.setGrade(grade);
                }
                else {
                    throw new Exception();
                }
                course.setGradeUnit();

                data[index] = course;
                index++;
            } catch (Exception ex) {
                System.out.println("** Wrong value, re-enter **");
            }
        }
        PrintFunction print = new PrintFunction();
        print.printTable(data);
    }
}
