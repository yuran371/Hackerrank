package Introduction;

public class LambdaCalculusEvaluatingExpressions {

	public static void main(String[] args) {
//		Compute the values
//		The required answer is an integer, which you may enter in the text box. 
//		Do not leave any leading or trailing spaces.
		
		#1
		 (λx.x+1)3
		 λx.x+1 3
		 4
		
		#2
		 (λx.x+1)((λy.y+2)3)
		 λx.x+1 (λy.y+2 3)
		 λx.x+1 3+2
		 5+1
		 6
		
		#3
		 λx.λy.x(^47)y // функция x применяется к начальному значению x 47 раз
		 47
		 
		#4
		 λx.λy.x(xy) // функция x применяется к начальному значению x 2 раз
		 2
		 
		#5
		 λx.λy.y
		 0
	}
}
