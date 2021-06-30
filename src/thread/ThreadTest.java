package thread;

class MyThread implements Runnable{ //Thread
	
	@Override
	public void run(){
		int i;
		for(i=1; i<=200; i++) {
			System.out.print(i+"\t");
		}
	}
	
}

public class ThreadTest {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start"); //main의 쓰레드
		//제일먼저끝남 //currentThread = static method
		MyThread runnable = new MyThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start(); //thread 1
		th2.start(); //thread 2 
		
		System.out.println(Thread.currentThread() + "end");
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		run.run();
		
		//Thread[main,5,main]start
			 //  호출함수,우선순위,쓰레드 그룹(속한곳)
			  // 총 3개의 쓰레드가 생성됨
	}
}
