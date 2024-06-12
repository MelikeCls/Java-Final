
  import java.util.*;

    public class Student {
        private String firstName;
        private String lastName;
        private int studentId;
        private List<Integer> grades;

        public Student(String firstName, String lastName, int studentId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentId = studentId;
            this.grades = new ArrayList<>();
        }

        public void addGrade(int grade) {
            grades.add(grade);
        }

        public double getAverageGrade() {
            if (grades.isEmpty()) {
                return 0.0;
            }
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / (double) grades.size();
        }

        // Getters and Setters
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public List<Integer> getGrades() {
            return grades;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", studentId=" + studentId +
                    ", grades=" + grades +
                    ", averageGrade=" + getAverageGrade() +
                    '}';
        }
    }


