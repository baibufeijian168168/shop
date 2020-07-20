package lambda表达式和匿名内部类的区别;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<>();
		array.add("a");
		array.add("bb");
		array.add("ccc");
		array.add("dddd");
		array.add("eeeee");
//		Collections.sort(array);
		Collections.sort(array, getComparator());
		System.out.println(array);
	}
	
	private static Comparator<String> getComparator(){
//		Comparator<String> com=
//		return new Comparator<String>(){
//			@Override
//			public int compare(String s1,String s2) {
//				return s2.length()-s1.length();
//			}
//		};
//	}
	return (s1,s2)-> s1.length()-s2.length();
	}
}
