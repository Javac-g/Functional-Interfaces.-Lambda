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
