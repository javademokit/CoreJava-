package notify;

public class NOSynchronize {
	public static void main(String[] args) {
		Thread1 b = new Thread1();
		b.start();
 
		System.out.println("Total is: " + b.total);
 
	}
}
 
class Thread1 extends Thread {
	int total;
 
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			total += i;
		}
	}
}