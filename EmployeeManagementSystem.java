import java.util.Scanner;

public class EmployeeManagementSystem {
    private static final int MAX_EMPLOYEES = 100;
    private String[] employeeIds = new String[MAX_EMPLOYEES];
    private String[] employeeNames = new String[MAX_EMPLOYEES];
    private String[] employeePositions = new String[MAX_EMPLOYEES];
    private int numEmployees = 0;

    public void addEmployee(String id, String name, String position) {
        if (numEmployees < MAX_EMPLOYEES) {
            employeeIds[numEmployees] = id;
            employeeNames[numEmployees] = name;
            employeePositions[numEmployees] = position;

            numEmployees++;
            System.out.println("Employee added successfully!");
        } else {
            System.out.println("Cannot add more employees. Maximum limit reached.");
        }
    }

    public void displayEmployees() {
        if (numEmployees == 0) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Employee Information:");
            for (int i = 0; i < numEmployees; i++) {
                System.out.println("ID: " + employeeIds[i] + ", Name: " + employeeNames[i] + ", Position: " + employeePositions[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem empManagementSystem = new EmployeeManagementSystem();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Employee Position: ");
                    String position = scanner.next();
                    empManagementSystem.addEmployee(id, name, position);
                    break;

                case 2:
                    empManagementSystem.displayEmployees();
                    break;

                case 3:
                    System.out.println("Exiting the Employee Management System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
