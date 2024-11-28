package employee.management;

public class Employee {

    private final String name; // Työntekijän nimi
    private final int age; // Työntekijän ikä
    private final String position; // Työntekijän asema (esim. Manager, Developer)
    private final double salary; // Työntekijän palkka
    private final String department; // Osasto, jossa työntekijä työskentelee

    // Constructor
    public Employee(String name, int age, String position, double salary, String department) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    // Subclass: Janitor
    public static class Janitor extends Employee {

        private final String shift; // Työvuoro, esim. "Aamu", "Ilta"
        private final String cleaningArea; // Alue, jonka siivooja huolehtii

        public Janitor(String name, int age, double salary, String department, String shift, String cleaningArea) {
            super(name, age, "Janitor", salary, department); // Kutsutaan yliluokan konstruktoria
            this.shift = shift;
            this.cleaningArea = cleaningArea;
        }

        public String getShift() {
            return shift;
        }

        public String getCleaningArea() {
            return cleaningArea;
        }

        @Override
        public String toString() {
            return "Janitor{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", position='" + getPosition() + '\'' +
                    ", salary=" + getSalary() +
                    ", department='" + getDepartment() + '\'' +
                    ", shift='" + shift + '\'' +
                    ", cleaningArea='" + cleaningArea + '\'' +
                    '}';
        }
    }
}
