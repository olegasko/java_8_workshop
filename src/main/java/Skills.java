import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Skills {
    JUNIT("JUnit"),
    SELENIUM("Selenium"),
    CUCUMBER("Cucumber"),
    JAVA("Java"),
    DOT_NET(".Net"),
    JBEHAVE("JBehave"),
    TEST_NG("TestNG"),
    SERENITY("Serenity");


    @Getter
    String skill;
}
