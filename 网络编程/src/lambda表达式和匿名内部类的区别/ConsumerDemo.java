package lambda表达式和匿名内部类的区别;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		String[] setArray= {"林青霞,35","张兵,22","紫霞,23"};
		printInfo(setArray,s->System.out.print("姓名: "+s.split(",")[0]),
				s->System.out.println("  年龄: "+20+Integer.parseInt(s.split(",")[1])));
	}
	private static void printInfo(String[] setArray,Consumer<String> 
	con1,Consumer<String> con2) {
		for(String str:setArray) {
			con1.andThen(con2).accept(str);
		}
	}
}
