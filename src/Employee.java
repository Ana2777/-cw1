public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private Integer salary;
    private Integer department;
    private static int counter = 0;
    private Integer id;

       public Employee (String surname, String name, String patronymic, Integer salary, Integer department) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.salary = salary;
            this.department = department;
            this.id = counter+1;
        }
        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public int getSalary() {
            return salary;
        }

        public int getDepartment() {
            return department;
        }

        public static int getCounter() {
            return counter;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void setDepartment(int department) {
            this.department = department;
        }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}


