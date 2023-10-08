public class Main {

    private static Employee[] employ = new Employee[10];

    public static void main(String[] args) {


        employ[0] = new Employee(1, "Дмитрий", "Кочетков", "Алексеевич", 190000);
        employ[1] = new Employee(3, "Виталий", "Бутыркин", "Долма", 132600);
        employ[2] = new Employee(5, "Анна", "Никандрова", "Хочупокушатьвна", 187000);
        employ[3] = new Employee(1, "Иван", "Стоун", "Панченков", 118000);
        employ[4] = new Employee(2, "Дмитрий", "Ютев", "Тимофеевич", 117000);
        employ[5] = new Employee(5, "Инна", "Кошелева", "Жульеновна", 175000);
        employ[6] = new Employee(2, "Александр", "Связной", "Кризисович", 116800);
        employ[7] = new Employee(1, "Юрий", "Смольный", "Пиратович", 180000);
        employ[8] = new Employee(5, "Акакий", "Тормоз", "Колбасович", 110000);
        employ[9] = new Employee(3, "Муслим", "Магомаев", "Магометович", 250000);

        printBioEployees();
        calculateSalary();
        System.out.println("Сумма зарплат сотрудников - " + calculateSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + findEmployeeMaxSalary());
        System.out.println("Cредняя зп : " + calculateAverageSalary());
        printFullNamesEmloyees();


    }

    private static void printBioEployees() {
        for (Employee e : employ) {
            System.out.println(e);
        }
    }

    private static double calculateSalary() {
        double sum = 0;
        for (Employee e : employ) {
            sum += e.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeMinSalary() {
        Employee employeeMinSalary = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee e : employ) {
            if (e.getSalary() < minSalary) {
                minSalary = e.getSalary();
                employeeMinSalary = e;
            }
        }
        return employeeMinSalary;
    }

    private static Employee findEmployeeMaxSalary() {
        Employee employeeMaxSalary = null;
        double maxSalary = Integer.MIN_VALUE;
        for (Employee e : employ) {
            if (e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                employeeMaxSalary = e;
            }
        }
        return employeeMaxSalary;
    }

    private static double calculateAverageSalary() {
        if (employ.length == 0) {
            return 0;
        }
        return calculateSalary() / employ.length;
    }

    private static void printFullNamesEmloyees() {
        for (Employee e : employ) {
            System.out.println(e.getName() + " " + e.getLastName() + " " + e.getSurName());
        }
    }
}