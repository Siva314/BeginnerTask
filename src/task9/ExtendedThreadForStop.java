package task9;

public class ExtendedThreadForStop extends Thread {
	private String name;
	private boolean state;
	private long sleepTime;
	public ExtendedThreadForStop(String name1,boolean state,long time){
		this.name=name1;
		this.state=state;
		this.sleepTime=time;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		while(!state) {			
			System.out.println(Thread.currentThread().getName()+" is running..");
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(currentThread().getName()+" stopped...");
	}
	public void changeState() {
		state=true;
	}
}
