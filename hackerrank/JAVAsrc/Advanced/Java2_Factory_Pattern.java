package Advanced;

import java.security.Permission;
import java.util.Scanner;

interface Food {
	 public String getType();
	}

	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {
	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	
	class FoodFactory {
		public Food getFood(String order) {
			Pizza p;
			Cake c;
			switch (order) {
			case "pizza": return p = new Pizza();
			case "cake": return c = new Cake();
			default: return null;
			}
		}
	}
public class Java2_Factory_Pattern {
	 public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			//creating the factory
			FoodFactory foodFactory = new FoodFactory();
			//factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());

	 }
}
