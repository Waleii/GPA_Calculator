public class AverageCalculator {
    public double averageFunction(CourseInfo [] data) {
        double totalGradePoint = 0;
        double totalGradeUnit = 0;

        for (CourseInfo course: data) {
            totalGradePoint += course.getGradeUnit() * course.getCourseUnit();
            totalGradeUnit += course.getCourseUnit();
        }
        return totalGradePoint / totalGradeUnit;
    }
}
