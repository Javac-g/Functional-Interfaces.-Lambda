import java.util.function.Predicate;
import java.util.Set;
import java.util.HashSet;

class MyUtils {
    
  private static String staticValue;

  private String instanceValue;

  {
    staticValue = "staticValue";
    instanceValue = "instanceValue";
  }

  public static void main(String[] args) {

    MyUtils utils = new MyUtils();
    utils.method();
  }

  public void method() {
    Set<Predicate<Integer>> predicates = new HashSet<>();
    predicates.add((p) -> true);
    predicates.add((p) -> false);
    predicates.add((p) -> false);
    predicates.add((p) -> false);
    predicates.add((p) -> false);
    predicates.add((p) -> true);

    StringBuilder stringBuilder = new StringBuilder();

    int i = 5;
    predicates.forEach((c) -> {

      stringBuilder.append(c.test(5 + i)).append(" && ");

    });
    System.out.println(
        String.format("(%s) = %s",
            stringBuilder.substring(0, stringBuilder.length() - 4), getPredicateFromSet(predicates).test(5)));
  }

  static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> predicates) {
    Predicate<Integer> result = (p) -> true;
    for (Predicate<Integer> predicate : predicates) {
      result = result.and(predicate);
    }
    return result;
  }
   
}
