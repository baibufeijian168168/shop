package lambda表达式和匿名内部类的区别;

public class LambdaDemo {
	public static void main(String[] args) {
		//匿名内部类
//		usePrintable(i->System.out.println(i));
		PtingString p=new PtingString();
//		usePrintable(String::equals);
//		usePrintable((s,i)->new PtingString(s,i));
//		usePrintable(new Runnable() {
//			@Override
//			public void run() {
//				for(int i=0;i<100;i++) {
//					System.out.println(Thread.currentThread().getName()+i);
//				}
//			}
//		});
		usePrintable(()->System.out.println(Thread.currentThread().getName()+"线程启动"));
		
	}
	public static void usePrintable(Runnable m) {
		new Thread(m).start();;
//		mm.start();
	}
}
