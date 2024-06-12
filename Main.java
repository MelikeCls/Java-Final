
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("\nÖğrenci Yönetim Sistemi");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Sil");
            System.out.println("3. Öğrenci Güncelle");
            System.out.println("4. Öğrencileri Listele");
            System.out.println("5. Öğrenci Ara");
            System.out.println("6. Öğrenciye Not Ekle");
            System.out.println("7. Öğrencilerin Ortalamalarını Hesapla");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Yeni satırı temizle

            switch (choice) {
                case 1:
                    System.out.print("Öğrenci adı: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Öğrenci soyadı: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Öğrenci kimlik numarası: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // Yeni satırı temizle

                    Student student = new Student(firstName, lastName, studentId);
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.print("Silinecek öğrencinin kimlik numarası: ");
                    int idToRemove = scanner.nextInt();
                    studentManager.removeStudent(idToRemove);
                    break;
                case 3:
                    System.out.print("Güncellenecek öğrencinin kimlik numarası: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Yeni satırı temizle
                    System.out.print("Yeni adı: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Yeni soyadı: ");
                    String newLastName = scanner.nextLine();
                    studentManager.updateStudent(idToUpdate, newFirstName, newLastName);
                    break;
                case 4:
                    studentManager.listStudents();
                    break;
                case 5:
                    System.out.print("Aranacak öğrencinin kimlik numarası: ");
                    int idToFind = scanner.nextInt();
                    Student foundStudent = studentManager.findStudent(idToFind);
                    if (foundStudent != null) {
                        System.out.println("Bulunan öğrenci: " + foundStudent);
                    } else {
                        System.out.println("Bu kimlik numarasıyla kayıtlı bir öğrenci bulunamadı.");
                    }
                    break;
                case 6:
                    System.out.print("Not eklenecek öğrencinin kimlik numarası: ");
                    int idToAddGrade = scanner.nextInt();
                    System.out.print("Eklenecek not: ");
                    int grade = scanner.nextInt();
                    studentManager.addGradeToStudent(idToAddGrade, grade);
                    break;
                case 7:
                    studentManager.calculateAverageGrades();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        }
    }
}
