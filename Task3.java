import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.List;
public class App {
    
    
    
    static BinaryOperator<String> greetingOperator =
      (parameter1, parameter2) -> String.format("Hello %s %s!!!",parameter1, parameter2);

    public static List<String> createGreetings(List<Person> persons, BinaryOperator<String> greetingOperator) {
        List<String> answer = new ArrayList<>();
        for (Person person : persons) {
          answer.add(greetingOperator.apply(person.name, person.surname));
        }
        return answer;
    }
}
