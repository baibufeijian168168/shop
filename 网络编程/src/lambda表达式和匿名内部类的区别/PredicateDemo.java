package lambda表达式和匿名内部类的区别;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
//		boolean b=checkString("hello",s->s.length()>8);
//		System.out.println(b);
//		boolean b1=checkString("helloworld",s->s.length()>8);
//		System.out.println(b1);
		boolean b=checkString("helloworld",s->s.length()>8,s->s.length()<15);
		System.out.println(b);
		
	}
	
	private static boolean checkString(String s,Predicate<String> pr1,
			Predicate<String> pr2) {
//		return pr1.and(pr2).test(s);
		return pr1.or(pr2).test(s);
	}
	
	
	
	private static boolean checkString(String s,Predicate<String> pre) {
		return pre.test(s);
//		return pre
	}
}
