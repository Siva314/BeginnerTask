package task9;

import util.InputUtils;

public class RunnerForThread { 
	public static void main(String[] args) throws InterruptedException {
		boolean flag=true;
		do {
			System.out.println("Enter the Choice..");
			int choice=InputUtils.getInteger(0);
			switch(choice) {
			case 0:
				System.out.println("Execution Stopped....");
				flag=false;
				break;
			
			case 1:
				ExtendedThread thread1=new ExtendedThread("siva",1500);
				System.out.println(thread1.getName());
				System.out.println(thread1.getPriority());
				System.out.println(thread1.getState());
				thread1.start();
				break;
			
			case 2:
				RunnableThread thread=new RunnableThread("pasupaathi",1500);
				Thread thread2=new Thread(thread);
				System.out.println(thread2.getName());
				System.out.println(thread2.getPriority());
				System.out.println(thread2.getState());
				thread2.start();
				break;
				
			case 3:
				ExtendedThread thread3=new ExtendedThread("siva",1200);
				RunnableThread thread4=new RunnableThread("pasupaathi",1350);
				Thread thread5=new Thread(thread4);
				System.out.println(thread3.getName());
				System.out.println(thread3.getPriority());
				System.out.println(thread3.getState());
				thread3.start();
				thread3.join();
				System.out.println(thread5.getName());
				System.out.println(thread5.getPriority());
				System.out.println(thread5.getState());
				thread5.start();
				break;
				
			case 4:
				System.out.println("Enter the number of threads..");
				int numberOfThreads=InputUtils.getInteger(0);
				for(int i=0;i<numberOfThreads;i++) {
				ExtendedThread thread8=new ExtendedThread("siva"+(i+1),120);
				thread8.start();
				}
				for(int i=0;i<numberOfThreads;i++) {
				RunnableThread thread6=new RunnableThread("pasupaathi"+(i+1),150);
				Thread thread7=new Thread(thread6);
				thread7.start();
				}
				break;
				
			case 5:
				System.out.println("Enter the number of threads..");
				int numberOfThreads1=InputUtils.getInteger(0);
				for(int i=0;i<numberOfThreads1;i++) {
					System.out.println("Enter the sleep time");
					int sleepTime=InputUtils.getInteger(0);
				ExtendedThread thread8=new ExtendedThread("siva"+(i+1),sleepTime);
				thread8.start();
				}
				for(int i=0;i<numberOfThreads1;i++) {
					System.out.println("Enter the sleep time");
					int sleepTime=InputUtils.getInteger(0);
				RunnableThread thread6=new RunnableThread("pasupaathi"+(i+1),sleepTime);
				Thread thread7=new Thread(thread6);
				thread7.start();
				}
				break;
			case 6:
				System.out.println("Enter the number of threads..");
				int numberOfThreads2=InputUtils.getInteger(0);
				for(int i=0;i<numberOfThreads2;i++) {
				ExtendedThreadForStop thread9=new ExtendedThreadForStop("siva "+(i+1),true,1000);
				thread9.start();
				}
				System.out.println("Enter the number of threads..");
				int numberOfThreads3=InputUtils.getInteger(0);
				for(int i=0;i<numberOfThreads3;i++) {
					RunnableThreadForStop thread10= new RunnableThreadForStop("runnablethread "+(i+1),true,1250);
					Thread thread11=new Thread(thread10);
					thread11.start();
				}
				break;
				
			case 7:
				ExtendedThreadForStop thread111=new ExtendedThreadForStop("krishna",false,800);
				thread111.start();
				RunnableThreadForStop thread12=new RunnableThreadForStop("siva",false,750);	
				Thread thread13=new Thread(thread12);
				thread13.start();
				RunnableThreadForStop thread14=new RunnableThreadForStop("vijay",false,650);	
				Thread thread15=new Thread(thread14);
				thread15.start();
				RunnableThreadForStop thread16=new RunnableThreadForStop("arun",false,850);	
				Thread thread17=new Thread(thread16);
				thread17.start();
				RunnableThreadForStop thread18=new RunnableThreadForStop("balaji",false,950);	
				Thread thread19=new Thread(thread18);
				thread19.start();
				Thread.sleep(6000);
				thread111.changeState();
				Thread.sleep(6000);
				thread12.changeState();;
				Thread.sleep(6000);
				thread14.changeState();
				Thread.sleep(6000);
				thread16.changeState();
				Thread.sleep(6000);
				thread18.changeState();
				if(!thread111.isAlive()&&!thread13.isAlive()&&!thread15.isAlive()&&!thread17.isAlive()&&!thread111.isAlive()&&!thread19.isAlive()) {
					System.out.println("Task Completed..Main thread going to sleep..");
					Thread.sleep(5000);
				}
				break;
			default:
				System.out.println("Invaild choice..");
				break;
			}
		}while(flag);
	}
}
