package task9;

public class RunnableThread implements Runnable {
	private String name;
	private int sleepTime;
	public RunnableThread(String name, int sleepTime) {
		this.name=name;
		this.sleepTime=sleepTime;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		System.out.println("Going to Sleep "+Thread.currentThread().getName());
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
		}
		System.out.println("After Sleep "+Thread.currentThread().getName());
	}
}
