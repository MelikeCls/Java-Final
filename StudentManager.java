


    import java.util.*;

    public class StudentManager {

        private Map<Integer, Student> studentMap;

        public StudentManager() {
            studentMap = new HashMap<>();
        }

        public void addStudent(Student student) {
            if (studentMap.containsKey(student.getStudentId())) {
                System.out.println("Bu kimlik numarasıyla zaten bir öğrenci var.");
            } else {
                studentMap.put(student.getStudentId(), student);
                System.out.println("Öğrenci eklendi: " + student);
            }
        }

        public void removeStudent(int studentId) {
            Student removedStudent = studentMap.remove(studentId);
            if (removedStudent != null) {
                System.out.println("Öğrenci silindi: " + removedStudent);
            } else {
                System.out.println("Bu kimlik numarasıyla kayıtlı bir öğrenci bulunamadı.");
            }
        }

        public void updateStudent(int studentId, String firstName, String lastName) {
            Student student = studentMap.get(studentId);
            if (student != null) {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                System.out.println("Öğrenci güncellendi: " + student);
            } else {
                System.out.println("Bu kimlik numarasıyla kayıtlı bir öğrenci bulunamadı.");
            }
        }

        public void listStudents() {
            for (Student student : studentMap.values()) {
                System.out.println(student);
            }
        }

        public Student findStudent(int studentId) {
            return studentMap.get(studentId);
        }

        public void addGradeToStudent(int studentId, int grade) {
            Student student = studentMap.get(studentId);
            if (student != null) {
                student.addGrade(grade);
                System.out.println("Not eklendi. Güncel öğrenci bilgileri: " + student);
            } else {
                System.out.println("Bu kimlik numarasıyla kayıtlı bir öğrenci bulunamadı.");
            }
        }

        public void calculateAverageGrades() {
            for (Student student : studentMap.values()) {
                System.out.println(student.getFirstName() + " " + student.getLastName() +
                        " adlı öğrencinin ortalama notu: " + student.getAverageGrade());
            }
        }


}
