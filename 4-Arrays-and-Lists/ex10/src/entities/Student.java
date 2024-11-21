package entities;

public class Student {
    private String name;
    private String ID;
    private float gradeFirstSemester;
    private float gradeSecondSemester;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Student(String name, String ID, float gradeFirstSemester, float gradeSecondSemester) {
        this.name = name;
        this.gradeSecondSemester = gradeSecondSemester;
        this.gradeFirstSemester = gradeFirstSemester;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public float getGradeFirstSemester() {
        return gradeFirstSemester;
    }

    public void setGradeFirstSemester(float gradeFirstSemester) {
        this.gradeFirstSemester = gradeFirstSemester;
    }

    public float getGradeSecondSemester() {
        return gradeSecondSemester;
    }

    public void setGradeSecondSemester(float gradeSecondSemester) {
        this.gradeSecondSemester = gradeSecondSemester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", gradeFirstSemester=" + gradeFirstSemester +
                ", gradeSecondSemester=" + gradeSecondSemester +
                '}';
    }
}
