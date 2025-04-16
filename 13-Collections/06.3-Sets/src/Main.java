import entities.Instructor;
import entities.Student;
import entities.enums.Cursos;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1111L, "Boberto");
        Student student2 = new Student(1222L, "Kara");
        Student student3 = new Student(1333L, "Gibião");
        student1.addCurso(Cursos.JAVA);
        student1.addCurso(Cursos.HTML);
        student1.addCurso(Cursos.JAVASCRIPT);
        student2.addCurso(Cursos.JAVA);
        student3.addCurso(Cursos.PYTHON);

        Instructor instructor1 = new Instructor(2111L, "Bastião");
        instructor1.addStudent(student1);
        instructor1.addStudent(student2);
        instructor1.addStudent(student3);

        System.out.println(instructor1);
    }
}