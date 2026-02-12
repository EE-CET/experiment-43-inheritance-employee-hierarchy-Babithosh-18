import java.util.Scanner;

class Employee {

 String name, phoneNumber, address;
    int age;
    double salary;

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

// TODO: Create class Officer extends Employee
// Add 'specialization' attribute

// TODO: Create class Manager extends Employee
// Add 'department' attribute

public class EmployeeInheritance {
   
        
        // --- OFFICER INPUT ---
        // Create Officer object
        // Read name, age, phone, address, salary, specialization
        // Hint: Use sc.nextLine() for strings to capture spaces, sc.nextInt() for numbers.
        // Be careful with buffer clearing after nextInt()!
        
        // --- MANAGER INPUT ---
        // Create Manager object
        // Read name, age, phone, address, salary, department
        
        // --- OUTPUT ---
        // Print "Officer:"
        // Print officer details (one per line)
        
        // Print "Manager:"
        // Print manager details (one per line)

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer o = new Officer();
        o.name = sc.nextLine();
        o.age = Integer.parseInt(sc.nextLine());
        o.phoneNumber = sc.nextLine();
        o.address = sc.nextLine();
        o.salary = Double.parseDouble(sc.nextLine());
        o.specialization = sc.nextLine();

        Manager m = new Manager();
        m.name = sc.nextLine();
        m.age = Integer.parseInt(sc.nextLine());
        m.phoneNumber = sc.nextLine();
        m.address = sc.nextLine();
        m.salary = Double.parseDouble(sc.nextLine());
        m.department = sc.nextLine();

        // Correct Output Format
        System.out.println("Officer:");
        System.out.println(o.name);
        System.out.println(o.age);
        System.out.println(o.phoneNumber);
        System.out.println(o.address);
        o.printSalary();
        System.out.println(o.specialization);

        System.out.println("Manager:");
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.phoneNumber);
        System.out.println(m.address);
        m.printSalary();
        System.out.println(m.department);

        sc.close();
    }
}