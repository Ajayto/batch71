package FuncationalInterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=(num1,num2,num3,num4)->num1+num2+num3+num4;
		System.out.println(a.getResult(10,20.20f,20,40.30f));
//		
//		B b=(num)->num%2==0;
//		System.out.println(b.isEven(7));
		
		
		
		
		
		
		
		
		
		
		
		Predicate<Integer> p=(num)->num%2==0;
		System.out.println(p.test(10));
		
		Consumer<Integer> c=(num)->System.out.println("this is message"+num);
		c.accept(10);
		
		BiFunction<Integer, Float, Float> b=(num1,num2)->num1+num2;
		System.out.println(b.apply(10, 20.20f));
		
		
	}

}
