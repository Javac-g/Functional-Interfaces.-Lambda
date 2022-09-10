import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;

public class MyUtils {

  public static int findMaxByCondition(List<Integer> numbers, Predicate<Integer> predicate) {
    int result = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      if (result < numbers.get(i) && predicate.test(numbers.get(i))) {
        result = numbers.get(i);
      }
    }
    return result;
  }

  public static void main(String[] args) {

  }
}

class User {

  public final List<Integer> values = new ArrayList<>();

  int getFilterdValue(BiFunction<List<Integer>, Predicate<Integer>, Integer> function, Predicate<Integer> predicate) {
    return function.apply(values, predicate);
  }

  int getMaxValueByCondition(Predicate<Integer> predicate) {
    return getFilterdValue((numbers, predicate1) -> MyUtils.findMaxByCondition(numbers, predicate1), predicate);
  }
}
