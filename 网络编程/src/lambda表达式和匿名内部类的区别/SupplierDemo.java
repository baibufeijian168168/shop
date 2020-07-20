package lambda表达式和匿名内部类的区别;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		int[] arr= {19,28,37,46,55};
		int maxvalue=getMax(()->{
			int max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		});
		System.out.println(maxvalue);
	}
	
	private static int getMax(Supplier<Integer> sup) {
		return sup.get();
	}
}
