import java.util.ArrayList;
import java.util.List;

class Person {
 
  String name;

  Person(String name) {
      
    this.name = name;
  }

  DecisionMethod goShopping = (productName, discount) -> "product1".equals(productName) && discount > 10;

}

@FunctionalInterface
interface DecisionMethod {
    
  boolean decide(String productName, int discount);
  
}

class Shop {
    
    public List<DecisionMethod> clients  = new ArrayList<>();

    public int sale(String item, int percent) {

    int count = 0;

    for (DecisionMethod decisionMethod : clients ) {
        
      if (decisionMethod.decide(item, percent)) {
          
        count++;
        
      }
    }

    return count;

  }
}
