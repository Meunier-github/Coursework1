
public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов", "Иван", "Иванович", 1, 100000);
        employeeBook.addEmployee("Петров", "Степан", "Николаевич", 2, 90000);
        employeeBook.addEmployee("Сидоров", "Александр", "Петрович", 2, 80000);
        employeeBook.addEmployee("Петрова", "Анна", "Николаевич", 3, 55000);
        employeeBook.addEmployee("Тургенева", "Марина", "Ивановна", 3, 60000);
        employeeBook.addEmployee("Пушкин", "Александр", "Сергеевич", 5, 120000);
        employeeBook.addEmployee("Рыжова", "Тамара", "Степановна", 5, 95000);
        employeeBook.addEmployee("Веселов", "Иван", "Николаевич", 5, 85000);
        employeeBook.addEmployee("Веселова", "Наталья", "Юрьевна", 1, 70000);
        employeeBook.addEmployee("Николаев", "Николай", "Юрьевич", 1, 75000);
        employeeBook.addEmployee("Фролов", "Николай", "Юрьевич", 1, 75000);

        employeeBook.printEmployee();
        System.out.println();

        employeeBook.printSalary();
        employeeBook.printMinSalary();
        employeeBook.printMaxSalary();
        employeeBook.printAverageSalary();
        System.out.println();

        employeeBook.printFIOEmployee();
        System.out.println();

        employeeBook.increaseSalary(5);
        employeeBook.printEmployee();
        System.out.println();

        employeeBook.printMinSalary(1);
        employeeBook.printMaxSalary(1);
        employeeBook.printSalary(1);
        employeeBook.printAverageSalary(1);
        System.out.println();

        employeeBook.increaseSalary(10, 2);
        employeeBook.printEmployee();
        System.out.println();

        employeeBook.printEmployee(1);
        System.out.println();

        employeeBook.printEmployeeSalaryUnder(100000);
        System.out.println();

        employeeBook.printEmployeeSalaryOver(100000);
        System.out.println();

        employeeBook.deleteEmployee(5);
        System.out.println();

        employeeBook.printEmployee();
        System.out.println();

        employeeBook.addEmployee("Фролов", "Николай", "Юрьевич", 1, 75000);
        employeeBook.printEmployee();
        System.out.println();

    }


}