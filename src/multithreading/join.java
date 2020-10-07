package multithreading;

public class join extends Thread {
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
				sleep(500);
			} catch (Exception e) {
				System.out.println(e);
				
				e.printStackTrace();
			}
			System.out.println(i);  
			
		}
	}
	
	public static void main(String[] args) {
		join j1=new join();
		join j2=new join();
		join j3=new join();
		
		j1.start();
		
		try {
			j1.join();
		} catch (Exception e) {
		System.out.println(e);
			e.printStackTrace();
		}
		
		j2.start();
		j3.start();
		


		
	}

}
