import java.util.function.Consumer;
import java.util.Arrays;
public class App {

    static Consumer<double[]> cons = (arr) -> {
        
    for (int i = 0; i < arr.length; i++) {
        
      if (arr[i] > 2.0) {
          
        arr[i] *= 0.8;
        
      } else {
          
        arr[i] *= 0.9;
        
      }
      
    }
    
  };

  public static double[] getChanged(double[] arrDouble, Consumer<double[]> consumer) {
      
    double[] result = Arrays.copyOf(arrDouble, arrDouble.length);
    
    consumer.accept(result);
    
    return result;
  }
}
