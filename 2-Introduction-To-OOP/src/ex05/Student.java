package ex05;

public class Student {
    private String name;
    private double gradeFirstSemester;
    private double gradeSecondSemester;
    private String ID;

    public Student (String name, String ID, double gradeFirstSemester, double gradeSecondSemester) {
        this.name = name;
        this.ID = ID;
        this.gradeFirstSemester = gradeFirstSemester;
        this.gradeSecondSemester = gradeSecondSemester;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGradeFirstSemester(double gradeFirstSemester) {
        if (gradeFirstSemester > 0 && gradeFirstSemester < 100) {
            this.gradeFirstSemester = gradeFirstSemester;
        }
    }

    public double getGradeFirstSemester() {
        return this.gradeFirstSemester;
    }

    public void setGradeSecondSemester(double gradeSecondSemester) {
        if (gradeSecondSemester > 0 && gradeSecondSemester < 100) {
            this.gradeSecondSemester = gradeSecondSemester;
        }
    }

    public double getGradeSecondSemester() {
        return this.gradeSecondSemester;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return this.ID;
    }

    public double finalGrade() {
        return (getGradeFirstSemester() + getGradeSecondSemester()) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeFirstSemester=" + gradeFirstSemester +
                ", gradeSecondSemester=" + gradeSecondSemester +
                ", ID='" + ID + '\'' +
                '}';
    }
}
