package entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class Instructor extends User {

    private final Set<Student> students = new LinkedHashSet<>();

    public Instructor(long id, String name) {
        super(id, name);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor{");
        sb.append(", students=[");

        for (Student s : students) {
            sb.append("{id=").append(s.getId())
                    .append(", name=").append(s.getName())
                    .append("}, ");
        }

        if (!students.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("Qtd de estudantes: ").append(students.size());

        sb.append("]}");
        return sb.toString();
    }

}
