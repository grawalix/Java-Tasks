package CricketScoreboard;


import java.util.Scanner;

public class Model {

			String name;
			int sequence;
			int singlerun,doublerun,triplerun,fourrun,sixrun,totalrun;
		
			Scanner sc=new Scanner(System.in);
			
			
			 public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public int getSequence() {
					return sequence;
				}

				public void setSequence(int sequence) {
					this.sequence = sequence;
				}

				public int getSinglerun() {
					return singlerun;
				}

				public void setSinglerun(int singlerun) {
					this.singlerun = singlerun;
				}

				public int getDoublerun() {
					return doublerun;
				}

				public void setDoublerun(int doublerun) {
					this.doublerun = doublerun;
				}

				public int getTriplerun() {
					return triplerun;
				}

				public void setTriplerun(int triplerun) {
					this.triplerun = triplerun;
				}

				public int getFourrun() {
					return fourrun;
				}

				public void setFourrun(int fourrun) {
					this.fourrun = fourrun;
				}

				public int getSixrun() {
					return sixrun;
				}

				public void setSixrun(int sixrun) {
					this.sixrun = sixrun;
				}

				public int getTotalrun() {
					return totalrun;
				}

				public void setTotalrun(int totalrun) {
					this.totalrun = totalrun;
				}
			
			
			
			void getData()
			{
				
				
					System.out.println("enter player name");
					name=sc.next();
					
					System.out.println("enter sequence");
					sequence=sc.nextInt();
					
					System.out.println("enter singles scored");
					singlerun=sc.nextInt();
					
					System.out.println("enter doubles scored");
					doublerun=sc.nextInt();
					
					System.out.println("enter triples scored");
					triplerun=sc.nextInt();
					
					System.out.println("enter boundaries scored");
					fourrun=sc.nextInt();
					
					System.out.println("enter sixes scored");
					sixrun=sc.nextInt();
					
						
					
			}
				
			
				 @Override
			public String toString() {
				return "Model [name=" + name + ", sequence=" + sequence + ", singlerun=" + singlerun + ", doublerun="
						+ doublerun + ", triplerun=" + triplerun + ", fourrun=" + fourrun + ", sixrun=" + sixrun
						+ ", totalrun=" + totalrun + "]";
			}

				void putData()  
			      {   
			           System.out.println(name + "\t"+sequence+"\t"+singlerun+"\t"+doublerun+"\t"+triplerun+"\t"+fourrun+"\t"+sixrun+"\t"+totalrun);  
			      }
				 

				 
				 void getTotalRuns() {
					 totalrun= singlerun+doublerun*2+triplerun*3+fourrun*4+sixrun*6;
					 
				 }
				

				static void getTotalRuns(Model[] m,int n)
				 {
					 for (int i = 0; i < n; i++) {
						m[i].totalrun=m[i].singlerun+m[i].doublerun+m[i].triplerun+m[i].fourrun+m[i].sixrun;
					}
					 
					 for (int i = 0; i < n; i++) {
						m[i].putData();
					}
					 
				 }

				
				
				
				 
				 
				 
			}
	








		