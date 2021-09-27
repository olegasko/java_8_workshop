import java.util.List;

public class DataLoader {

    public static List<Employee> loadData() {
        return List.of(
                new Employee(
                        "Ivan",
                        "Ivanov",
                        Employee.Title.JUNIOR_ENGINEER,
                        List.of(Skills.JUNIT, Skills.SELENIUM)),
                new Employee(
                        "Sergiy",
                        "Sergiev",
                        Employee.Title.ENGINEER,
                        List.of(Skills.JUNIT, Skills.SELENIUM, Skills.JAVA)),
                new Employee(
                        "Petr",
                        "Petrov",
                        Employee.Title.SENIOR_ENGINEER,
                        List.of(Skills.JUNIT, Skills.SELENIUM, Skills.CUCUMBER, Skills.SERENITY)),
                new Employee(
                        "Volodymyr",
                        "Volodymyrov",
                        Employee.Title.LEAD_ENGINEER,
                        List.of(Skills.SELENIUM, Skills.CUCUMBER, Skills.SERENITY, Skills.JBEHAVE, Skills.DOT_NET, Skills.JAVA)),
                new Employee(
                        "Piter",
                        "Jeckson",
                        Employee.Title.LEAD_ENGINEER,
                        List.of(Skills.SELENIUM, Skills.CUCUMBER, Skills.JBEHAVE, Skills.DOT_NET, Skills.JAVA))
        );
    }
}
