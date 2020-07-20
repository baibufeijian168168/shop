package lambda表达式和匿名内部类的区别;

import java.util.ArrayList;

public class Predicate {
	public static void main(String[] args) {
		String[] strArray= {"林青霞,30","至尊宝,43","孙悟空,35","貂蝉,31","王祖贤,33"};
		ArrayList<String> arr=myFileter(strArray,s->s.split(",")[0].length()>2,s->Integer.parseInt(s.split(",")[1])>33);
		for(String s:arr) {
			System.out.println(s);
		}
	}
	


	private static ArrayList<String> myFileter(String[] strArray,Predicate<String> pre1,Predicate<String> pre2){
		ArrayList<String> array=new ArrayList<String>();
			for(String str:strArray) {
				if(pre1.and(pre2).test(str)) {  
					array.add(str);
				}
			}
		return array;
	} 
}
