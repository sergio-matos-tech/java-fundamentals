package entities;

import entities.enums.Cursos;

import java.util.HashSet;
import java.util.Set;

public class Student extends User {
    private final Set<Cursos> cursos = new HashSet<>();

    public Student(long id, String name) {
        super(id, name);
    }

    public void addCurso(Cursos curso) {
        this.cursos.add(curso);
    }

    public void removeCurso(Cursos curso) {
        this.cursos.remove(curso);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", cursos=" + cursos +
                '}';
    }

}
