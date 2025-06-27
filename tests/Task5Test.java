package jom.com.softserve.s5.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task5Test {
	private static String MY_UTILS = "jom.com.softserve.s5.task5.MyUtils";

	@DisplayName("Check that MyUtil class is present")
	@Test
	public void isTypeClass() {
		try {
			Class<?> clazz = Class.forName(MY_UTILS);
			assertNotNull(clazz);
			assertTrue(clazz.getSimpleName().equals("MyUtils"));

		} catch (ClassNotFoundException e) {
			fail("There is no MyUtils class");
		}
	}

	@DisplayName("Check that MyUtil class has 'getPredicateFromSet' method")
	@Test
	public void hasTypeDeclaredMethod() {
		try {
			Class<?> clazz = Class.forName(MY_UTILS);
			Method[] methods = clazz.getDeclaredMethods();
			boolean isMethod = false;
			for (Method method : methods) {
				if (method.getName().equals("getPredicateFromSet")) {
					isMethod = true;
					Class<?>[] parameterTypes = method.getParameterTypes();
					assertTrue(Arrays.equals(new Class[] { Set.class }, parameterTypes));
				}
			}
			assertTrue(isMethod, "There is no 'getPredicateFromSet' method");
		} catch (ClassNotFoundException e) {
			fail("There is no MyUtils class");
		}
	}

	@DisplayName("Check that 'getPredicateFromSet' method returns Predicate")
	@Test
	public void hasMethodReturnType() {
		try {
			Class<?> clazz = Class.forName(MY_UTILS);
			Method[] methods = clazz.getDeclaredMethods();
			boolean isMethod = false;
			for (Method method : methods) {
				if (method.getName().equals("getPredicateFromSet")) {
					isMethod = true;
					assertEquals(method.getReturnType(), Predicate.class);
				}
			}
			assertTrue(isMethod, "There is no 'getPredicateFromSet' method");
		} catch (ClassNotFoundException e) {
			fail("There is no MyUtils class");
		}
	}

	@DisplayName("Check the result of 'getPredicateFromSet' method")
	@Test
	public void isGetPredicateFromSetCorrect() {
		Set<Predicate<Integer>> set = new HashSet<Predicate<Integer>>() ;
		Predicate<Integer> predicate = n -> n % 2 == 0;
		set.add(predicate);
		Predicate<Integer> predicate2 = n2 -> n2 % 3 == 0;
		set.add(predicate2);
		Predicate<Integer> predicate3 = n3 -> n3 > 5;
		set.add(predicate3);
		
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		boolean result = true;
		Predicate<Integer> predicateFromSet = MyUtils.getPredicateFromSet((Set<Predicate<Integer>>) set);
		for (int intValue : list) {
           if (predicateFromSet.test(intValue) != predicate.test(intValue) && predicate2.test(intValue) && predicate3.test(intValue)) {
               result = false;
               break;
           }
		}
		assertTrue(result);
	}
}
