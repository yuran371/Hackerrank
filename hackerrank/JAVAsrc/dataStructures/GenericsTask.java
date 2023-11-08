package dataStructures;

import java.io.BufferedReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericsTask {	
	<T> void printArray (T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			T t = arr[i];
			System.out.println(t);
			}
	}
    public static void main( String args[] ) {
    	GenericsTask myPrinter = new GenericsTask();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : GenericsTask.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
