import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n--- Student Database Menu ---");
            System.out.println("1. Insert Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Department");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: "); int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: "); String name = sc.nextLine();
                        System.out.print("Enter Age: "); int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Department: "); String dept = sc.nextLine();
                        dao.insertStudent(new Student(id, name, age, dept));
                        System.out.println("Student Added!");
                        break;

                    case 2:
                        for (Student s : dao.getAllStudents()) {
                            System.out.println(s.getId() + " | " + s.getName() +
                                    " | " + s.getAge() + " | " + s.getDepartment());
                        }
                        break;

                    case 3:
                        System.out.print("Enter Student ID to Update: "); int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Department: "); String newDept = sc.nextLine();
                        dao.updateStudent(uid, newDept);
                        System.out.println("Updated!");
                        break;

                    case 4:
                        System.out.print("Enter Student ID to Delete: "); int did = sc.nextInt();
                        dao.deleteStudent(did);
                        System.out.println("Deleted!");
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
