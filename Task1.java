import java.util.Arrays;
import java.util.function.Predicate;


public class MyUtils {

    public static int getCount( int[] arr, Predicate<Integer> predicate) {
        
        int count = 0;
        
        for(int x: arr){
            
            if(predicate.test(x))count++;
            
        }
        return count;
        
        
        
    }
}
