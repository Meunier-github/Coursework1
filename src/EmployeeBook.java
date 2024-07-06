public class EmployeeBook {

    private final Employee[] employee;

    public EmployeeBook() {
        this.employee = new Employee[10];
    }

    private boolean isAddEmployee(String surname, String name, String secondname,
                                  int department, int salary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = new Employee(surname, name, secondname, department, salary);
                return true;
            }
        }
        return false;
    }

    public void addEmployee(String surname, String name, String secondname,
                            int department, int salary) {
        if (isAddEmployee(surname, name, secondname, department, salary)) {
            System.out.println(STR."Сотрудник \{surname} \{name} \{secondname} успешно добавлен!");
        } else {
            System.out.println(STR."Сотрудник \{surname} \{name} \{secondname} не добавлен. Не достаточно места!");
        }
    }

    public void printEmployee() {
        System.out.println("Список сотрудников:");
        for (Employee value : employee) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }

    public int calculateSalary() {
        int sum = 0;
        for (Employee value : employee) {
            if (value != null) {
                sum += value.getSalary();
            }
        }
        return sum;
    }

    public void printSalary() {
        System.out.println(STR."Зарплата всех сотрудников: \{calculateSalary()}");
    }

    public void printSalary(int department) {
        System.out.println(STR."Зарплата сотрудников отдела \{department}: \{calculateSalary(department)}");
    }

    public boolean isEmptyArray() {
        for (Employee value : employee) {
            if (value != null) {
                return false;
            }
        }
        return true;
    }

    public int findMinSalary() {
        int min = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getSalary() < min) {
                min = value.getSalary();
            }
        }
        if (isEmptyArray()) {
            return 0;
        }
        return min;
    }

    public void printMinSalary() {
        System.out.println(STR."Минимальная зарплата: \{findMinSalary()}");
    }

    public void printMinSalary(int department) {
        System.out.println("Минимальная зарплата сотрудников отдела " + department + ": " + findMinSalary(department));
    }

    public int findMaxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getSalary() > max) {
                max = value.getSalary();
            }
        }
        if (isEmptyArray()) {
            return 0;
        }
        return max;
    }

    public void printMaxSalary() {
        System.out.println("Максимальная зарплата: " + findMaxSalary());
    }

    public void printMaxSalary(int department) {
        System.out.println("Максимальная зарплата сотрудников отдела " + department + ": " + findMaxSalary(department));
    }

    public double findAverageSalary() {
        double average = 0;
        int count = countEmployee();
        if (employee.length != 0 && count != 0) {
            average = (double) calculateSalary() / count;
        }
        return average;
    }

    public void printAverageSalary() {
        System.out.println("Средняя зарплата: " + findAverageSalary());
    }

    public void printAverageSalary(int department) {
        System.out.println("Средняя зарплата сотрудников отдела " + department + ": " + findAverageSalary(department));
    }


    public void printFIOEmployee() {
        System.out.println("ФИО сотрудников:");
        for (Employee value : employee) {
            if (value != null) {
                System.out.println(value.toStringFIO());
            }
        }
    }

    private boolean isIncreaseSalary(int percent) {
        boolean flag = false;
        for (Employee value : employee) {
            if (value != null) {
                int newSalary = (int) (value.getSalary() * (1 + (double) percent / 100));
                value.setSalary(newSalary);
                flag = true;
            }
        }
        return flag;
    }

    public void increaseSalary(int percent) {
        if (isIncreaseSalary(percent)) {
            System.out.println("Повышение зарплаты на " + percent + "% успешно прошло");
        } else {
            System.out.println("Повышение зарплаты на " + percent + "% не прошло");
        }
    }

    public int findMinSalary(int department) {
        int min = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department && value.getSalary() < min) {
                min = value.getSalary();
            }
        }
        if (isEmptyArray()) {
            return 0;
        }
        return min;
    }

    public int findMaxSalary(int department) {
        int max = Integer.MIN_VALUE;
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department && value.getSalary() > max) {
                max = value.getSalary();
            }
        }
        if (isEmptyArray()) {
            return 0;
        }
        return max;
    }

    public int calculateSalary(int department) {
        int sum = 0;
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department) {
                sum += value.getSalary();
            }
        }
        return sum;
    }
    public int countEmployee() {
        int count = 0;
        for (Employee value : employee) {
            if (value != null) {
                count++;
            }
        }
        return count;
    }

    public int countEmployee(int department) {
        int count = 0;
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department) {
                count++;
            }
        }
        return count;
    }

    public double findAverageSalary(int department) {
        double average = 0;
        int count = countEmployee(department);
        if (employee.length != 0 && count != 0) {
            average = (double) calculateSalary(department) / count;
        }
        return average;
    }

    private boolean isIncreaseSalary(int percent, int department) {
        boolean flag = false;
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department) {
                int newSalary = (int) (value.getSalary() * (1 + (double) percent / 100));
                value.setSalary(newSalary);
                flag = true;
            }
        }
        return flag;
    }

    public void increaseSalary(int percent, int department) {
        if (isIncreaseSalary(percent, department)) {
            System.out.println("Повышение зарплаты сотрудникам отдела " + department + " на " + percent + "% успешно прошло");
        } else {
            System.out.println("Повышение зарплаты  сотрудникам отдела " + department + " на " + percent + "% не прошло");
        }

    }

    public void printEmployee(int department) {
        System.out.println("Список сотрудников отдела " + department + ":");
        for (Employee value : employee) {
            if (value != null && value.getDepartment() == department) {
                System.out.println(value.toStringDepartment());
            }
        }
    }

    public void printEmployeeSalaryUnder(int salary) {
        System.out.println("Список сотрудников с зарплатой меньше " + salary + ":");
        for (Employee value : employee) {
            if (value != null && value.getSalary() < salary) {
                System.out.println(value.toStringEmployeeId());
            }
        }
    }

    public void printEmployeeSalaryOver(int salary) {
        System.out.println("Список сотрудников с зарплатой больше или равной " + salary + ":");
        for (Employee value : employee) {
            if (value != null && value.getSalary() >= salary) {
                System.out.println(value.toStringEmployeeId());
            }
        }
    }

    private boolean isDeleteEmployee(int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getId() == id) {
                employee[i] = null;
                return true;
            }

        }
        return false;
    }

    public void deleteEmployee(int id) {
        if (isDeleteEmployee(id)) {
            System.out.println("Сотрудник c ID = " + id + " удален!");
        } else {
            System.out.println("Сотрудник c ID = " + id + " не найден!");
        }
    }


}
