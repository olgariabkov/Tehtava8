package employee.management;

import java.util.HashMap;

public class EmployeeManagement {

    private final HashMap<Integer, Employee> employees;

    public EmployeeManagement() {
        this.employees = new HashMap<>();
    }

    // Lisää työntekijä tietorakenteeseen
    public void addEmployee(int id, Employee employee) {
        employees.put(id, employee);
    }

    // Etsi työntekijä ID:n perusteella
    public Employee findEmployee(int id) {
        return employees.get(id);
    }

    // Etsi työntekijä nimen perusteella
    public Employee searchEmployeeByName(String name) {
        for (Employee employee : employees.values()) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    // Tulosta kaikki työntekijät
    public void printAllEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    // Tallennus ja lataus tiedostoista
    public HashMap<Integer, Employee> getEmployees() {
        return employees;
    }
}
