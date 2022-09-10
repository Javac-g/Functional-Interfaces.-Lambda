# Functional-Interfaces.-Lambda
Practice tasks

Task 1

Implement a static method getCount(...) that takes an array of integers as the first parameter. The second parameter is a functional interface that works with integers and defines a some condition.

The method should return the count of elements in the array that satisfy the condition defined by the second argument.


Task 2

Create the static field cons of type Consumer and assign it the lambda expression that takes an array of doubles as a parameter and changes it using the next rule: all values that are greater than 2 should be multiplied by 0.8, and other values should be multiplied by 0.9.

Also implement a static method getChanged(...) that takes an array of doubles as a first parameter and Consumer implementation as a second. The method should return an array changed by the second parameter.

The getChanged(...) method should not change initial array.


Task 3 


Suppose, we have the next class Person:
<pre>
<code>
class Person{    
  String name;    
  String surname;     
  Person(String name, String surname){ 
          this.name = name;       
          this.surname = surname;   
          }
 }
</code>
</pre>
Add to App class static field greetingOperator of type BinaryOperator . 

The greetingOperator should create a new string as a result by the rule: "Hello " + parameter1 + " " + parameter2 + "!!!"

Create a static method createGreetings(...) that takes two parameters: List<Person> and BinaryOperator and generates List<String> as a result. We should be able to pass greetingOperator as a parameter here.

Please, use the second parameter in creating the result.
  
  
Task 4

  
Suppose, we have the Person class with fields name and goShopping.

The goShopping field defines if Person will do shopping based on product name and discount that come as parameters. You should define the next default behavior for goShopping:

return true if product name = "product1"  and discount > 10, otherwise return false.

Define the type for goShopping field and name it DecisionMethod and define a method decide in it.

Also, we have the class Shop with method sale(). This method informs users about a discount product and a percentage of discount by using their goShopping values (which are stored in clients field). The method should return the count of users that will go shopping.
  
  
Task 5
  
Implement a static method getPredicateFromSet(...) in MyUtils class.

The getPredicateFromSet method should take a Set of predicates working with integers as a parameter and return a predicate with the functionality of all predicates in the set invoked and connected by logical AND.
  
  
Task 6
  
  
  
Implement a static method findMaxByCondition(...) of MyUtils class that takes List of integers as a first parameter and predicate as a second and returns the max value from the list that satisfies the condition of the predicate.

Also, implement getFilterdValue(...) method of User class. The getFilteredValue(...) method should be able to take MyUtils.findMaxByCondition(...) as a first parameter and Predicate as a second. This method should return an integer value, evaluated from User's field values using the first and second parameters of getFilterdValue(...) method.

One more method that needs to be implemented in User class is getMaxValueByCondition(...). This method has one Predicate parameter. The implementation should call getFilterdValue(...) method with MyUtils.findMaxByCondition(...) as a first parameter and passed along Predicate as a second.
