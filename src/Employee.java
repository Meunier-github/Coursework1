import java.util.Objects;

public class Employee {
    private final String surname;
    private final String name;
    private final String secondname;
    private int department;
    private int salary;
    static int counter;
    private final int id;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondname() {
        return secondname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id
                && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name)
                && Objects.equals(secondname, employee.secondname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, secondname, department, salary, id);
    }

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.secondname = patronymic;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return STR."ФИО: \{surname} \{name} \{secondname}\{','} Отдел: \{department}\{','} Зарплата: \{salary}";
    }

    public String toStringDepartment() {
        return
                STR."ФИО: \{surname} \{name} \{secondname}\{','} Зарплата: \{salary}";
    }

    public String toStringFIO() {
        return STR."\{surname} \{name} \{secondname}";

    }

    public String toStringEmployeeId() {
        return STR."Id: \{id}, ФИО: \{surname} \{name} \{secondname}, Зарплата: \{salary}";

    }

}
