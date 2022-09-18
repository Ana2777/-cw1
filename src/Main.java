import java.util.Arrays;

public class Main {
    private static Employee[] workers = new Employee[15];

    public static void main(String[] args) {
        Employee no1 = new Employee("Туров", "Мартин", "Никитевич", 97400, 1);
        Employee no2 = new Employee("Меркушев", "Валентин", "Андреевич", 54011, 1);
        Employee no3 = new Employee("Григорьев", "Георгий", "Ростиславович", 68120, 1);
        Employee no4 = new Employee("Костина", "Валерия", "Тимофеевна", 45160, 2);
        Employee no5 = new Employee("Шубина", "Амина", "Богдановна", 64200, 2);
        Employee no6 = new Employee("Воробьев", "Владислав", "Викторович", 105012, 2);
        Employee no7 = new Employee("Иванова", "Валерия", "Елисеевна", 74650, 3);
        Employee no8 = new Employee("Булгакова", "Ксения", "Львовна", 86540, 3);
        Employee no9 = new Employee("Воронцова", "Анна", "Артемьевна", 46300, 3);
        Employee no10 = new Employee("Гришин", "Фёдор", "Тимофеевич", 54852, 4);
        Employee no11 = new Employee("Семенова", "Варвара", "Александровна", 35040, 4);
        Employee no12 = new Employee("Юдин", "Денис", "Кириллович", 54826, 4);
        Employee no13 = new Employee("Беляева", "Полина", "Марковна", 65923, 5);
        Employee no14 = new Employee("Лобанова", "София", "Ивановна", 93234, 5);
        Employee no15 = new Employee("Павлов", "Лев", "Алексеевич", 45356, 5);

        workers[0] = no1;
        workers[1] = no2;
        workers[2] = no3;
        workers[3] = no4;
        workers[4] = no5;
        workers[5] = no6;
        workers[6] = no7;
        workers[7] = no8;
        workers[8] = no9;
        workers[9] = no10;
        workers[10] = no11;
        workers[11] = no12;
        workers[12] = no13;
        workers[13] = no14;
        workers[14] = no15;
    }

    public static void employeeSeal() {
        for (Employee employee : workers) {
            System.out.println(employee);
        }
    }

    public static int salaryCostsRorAllEmployees() {
        int salaryTotal = 0;
        for (Employee employee : workers) {
            salaryTotal += employee.getSalary();
        }
        return salaryTotal;
    }

    public static Employee minimumWage() {
        Employee results = workers[0];
        int min = workers[0].getSalary();
        for (Employee employee : workers) {
            if (min > workers[0].getSalary()) {
                min = workers[0].getSalary();
                results = employee;
            }
        }
        return results;
    }

    public static Employee maximumWage() {
        Employee result = workers[0];
        int max = workers[0].getSalary();
        for (Employee employee : workers) {
            if (max > workers[0].getSalary()) {
                max = workers[0].getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static int averageSalaryValue() {
        int counter1 = 0;
        int salaryTotal1 = 0;
        for (Employee employee : workers) {
            if (employee != null) {
                counter1++;
                salaryTotal1 += employee.getSalary();
            }

        }
        return salaryTotal1;
    }
}


