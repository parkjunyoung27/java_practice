package thread;

class Bank{ //shared resource
	
	private int money = 10000;

	public void saveMoney(int save) {
		
			
		
		int m = getMoney();
		
		try {
			Thread.sleep(3000);// 3 second
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m+save);
	}
	
	public  void minusMoney(int minus) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(2000); // 2 second
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
		
}

class Park extends Thread{
	
	public void run() {
		
		System.out.println("start save");
		SyncMain.mybank.saveMoney(3000);
		System.out.println("saveMoney(3000) : " + SyncMain.mybank.getMoney());
	}
	
}

class ParkWife extends Thread{
	
	public void run() {
		synchronized (SyncMain.mybank) {
		
		System.out.println("start minus");
		SyncMain.mybank.minusMoney(1000);
		System.out.println("minusMoney(1000) : " + SyncMain.mybank.getMoney());
		}
	}
	
}


public class SyncMain {
	
	public static Bank mybank = new Bank();
	
	public static void main(String[] args) {
		
		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
		
	}
}
