package Introduction;

public class Lambda_Calculus_Reductions_4 {

	public static void main(String[] args) {
		
//		Reduce the following expression to no more than one term. 
//		If the expression cannot be reduced, enter "CAN'T REDUCE".
		#1.
		((λx.(x y))(λz.z))
		(λz.z) y
		λz.z y
		y		
		
		#2.
		((λx.((λy.(x y))x))(λz.w))
		λx.((λy.(x y))x) λz.w
		λy.(λz.w y) λz.w
		λz.w λz.w
		w // т.к. в теле w нет аргументов z
		
		#3.
		((λx.(x x))(λx.(x x))) 
		λx.(x x) λx.(x x) 
		λx.(x x) λx.(x x)
		// infinity loop
		
		#4.
		λg.((λf.((λx.(f (x x)))(λx.(f (x x))))) g) 
		λg.(g ((λx.(g (x x))) (λx.(g (x x)))))
		// infinity loop		
	}
}
