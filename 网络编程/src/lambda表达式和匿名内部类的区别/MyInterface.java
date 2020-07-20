package lambda表达式和匿名内部类的区别;

public interface MyInterface {
	PtingString show1(String s,int ss);
	
	public default void show4() {
		System.out.println("show4");
	}
	public static void show5() {
		System.out.println(678);
	}
}
