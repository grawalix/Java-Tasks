package CricketScoreboard;


import java.util.Arrays;
import java.util.Scanner;

public class Example {
	
	
  public static void main(String[] args) {
	  
	  
		Scanner sc=new Scanner(System.in);

	  boolean flag=true;
	  int choice;
	  
		  System.out.println("enter no of players");
		int n=sc.nextInt();
		Model[] m= new Model[n];
		
		for (int i = 0; i < n; i++) {
			 m[i] = new Model();  
             m[i].getData(); 
		}
		
		
		System.out.println("the players are");
		for (Model model : m) {
			System.out.println(model);
		}
		
		
		
		
//	       System.out.println("enter sequence no of player for total runs scored");  
//		int total=sc.nextInt();
//		for (int i = 0; i < n; i++) {                                                                  
//			if (m[i].sequence==total)
//			{
//				System.out.println("total runs scored by players");
//
//				m[i].getTotalRuns();
//				m[i].putData();
//			}
//			else
//			{
//				System.out.println("invalid sequence no.");
//			}
//		}
		
		System.out.println("sorted list of players is");
		System.out.println(m.length);
		for (int i = 0; i <= m.length-1; i++) {
			for (int j = i+1; j <= m.length-1; j++) {
				System.out.println("hiiii");
				if(m[i].getSequence() >= m[j].getSequence()) {
					System.out.println("hello");
					Model sequence_temp=m[i];
					m[i]=m[j];
					m[j]=sequence_temp;
					for (Model model : m) {
						System.out.println(model);
					}
				}
			}
		}
		
		
		
		
		System.out.println("enter player name for searching");
		String playername=sc.next();                                                                                                         
			for (int i = 0; i < n; i++) {
				if(m[i].getName().equals(playername) ) {
					System.out.println(m[i].getName()+ " "+m[i].getSequence()+ " "+m[i].getSinglerun()+ " "+m[i].getDoublerun()+" "+m[i].getTriplerun()+" "+m[i].getFourrun()+" "+m[i].getSixrun());
						
				}
				
                 } 
                
			
			
			System.out.println(" total runs scored by players");
			while(true) {
				System.out.println("\n1.Display total runs of players\n2.Exit ");
				System.out.println("enter your choice");
				choice=sc.nextInt();
				
				switch (choice) {
				case 1:
					for (int i = 0; i < n; i++) {
						m[i].getTotalRuns();
						m[i].putData();
					}
					break;
				
					
				case 2:
					System.exit(0);
				default:
					break;
				}
			}

			
			
	
		
}


	       
}


