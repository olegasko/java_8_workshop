import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    String name;
    String soname;
    Title title;
    List<Skills> skills;


    enum Title {
        JUNIOR_ENGINEER,
        ENGINEER,
        SENIOR_ENGINEER,
        LEAD_ENGINEER
    }

}
