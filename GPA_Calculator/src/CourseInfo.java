public class CourseInfo {
    private String courseCode;
    private int courseUnit;
    private String grade;
    private int gradeUnit;

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }

    public int getCourseUnit() {
        return this.courseUnit;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGradeUnit() {
        switch (this.grade) {
            case "A":
                this.gradeUnit = 5;
                break;
            case "B":
                this.gradeUnit = 4;
                break;
            case "C":
                this.gradeUnit = 3;
                break;
            case "D":
                this.gradeUnit = 2;
                break;
            case "E":
                this.gradeUnit = 1;
                break;
            default:
                this.gradeUnit = 0;
                break;
        }
    }
    public int getGradeUnit() {
        return this.gradeUnit;
    }
}
