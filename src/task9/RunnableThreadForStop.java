package task9;

public class RunnableThreadForStop implements Runnable {
	private String name;
	private boolean number;
	private long sleepTime;
	public RunnableThreadForStop(String name1,boolean state,long time){
		this.name=name1;
		this.number=state;
		this.sleepTime=time;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		while(!number) {			
			System.out.println(Thread.currentThread().getName()+" is running..");
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(Thread.currentThread().getName()+" stopped...");
	}
	public void changeState() {
		number=true;
	}
}
