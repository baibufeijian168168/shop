package lambda表达式和匿名内部类的区别;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		convert("100",s->Integer.parseInt(s));
		convert("100",Integer::parseInt);
		
		convert(100,i->String.valueOf(i+888));
		converi("10",s->Integer.parseInt(s),i->String.valueOf(i+1));
	}
	
	private static void convert(String s, Function<String,Integer>fun) {
		Integer i=fun.apply(s);
		System.out.println(i);
	}
	private static void convert(int i,Function<Integer,String> fun) {
		String apply = fun.apply(i);
		System.out.println(apply);
	}
	private static void converi(String s,Function<String,Integer>i,Function<Integer,String> ss) {
//		int ii=i.apply(s);
//		String sss=ss.apply(ii);
//		System.out.println(sss);
		String shuchu=i.andThen(ss).apply(s);
		System.out.println(shuchu);
	}
}
