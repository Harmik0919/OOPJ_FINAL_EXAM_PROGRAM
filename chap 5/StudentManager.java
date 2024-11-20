import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}

public class StudentManager {
    private List<Student> students;
    private String fileName;

    public StudentManager(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        loadStudents();
    }

    public void addStudent(Student student) {
        students.add(student);
        saveStudents();
    }

    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
        saveStudents();
    }

    public Student getStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void loadStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while loading students.");
            e.printStackTrace();
        }
    }

    private void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("An error occurred while saving students.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager("students.dat");

        Student student1 = new Student("John Doe", 20, "S001");
        Student student2 = new Student("Jane Smith", 22, "S002");

        manager.addStudent(student1);
        manager.addStudent(student2);

        manager.displayAllStudents();

        manager.removeStudent("S001");

        manager.displayAllStudents();
    }
}
