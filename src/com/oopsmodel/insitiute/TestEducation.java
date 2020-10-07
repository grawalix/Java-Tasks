package com.oopsmodel.insitiute;

//******************* TestEducation Class **********//

import java.util.Scanner;

public class TestEducation {
	public static void main(String[] args) {
		System.out.println("welcome to educational institution");
		System.out.println(" please enter your choice");
		Scanner input = new Scanner(System.in);
		System.out.println("which course you choose"+"\n"+"press 1 to science"+"\n"+"press 2 to commerce"+"\n"+"press 3 to humanity");
		int choice=input.nextInt();
		
		// FIRST SWITCH STATEMENT
		
		switch (choice) {
		case 1:
			EducationInsitiution course = new Science();
			course.courseTaken();
			System.out.println("would you like to proceed further studies");
			System.out.println("yes  "+"  or  "+"  No  ");
			String choice2=input.next();
			
			// SECOND SWITCH STATEMENT
			switch (choice2) {
			case "yes":
				System.out.println("press enter choice for future studies"+"\n"+"press 1 to engineering"+"\n"+"press 2 to finance"+"\n"+"press 3 to literature");
				int choicef=input.nextInt();
				
				
				//THIRD SWITCH STATEMENTs 
				/*  Nested Switch inside case 1 of first switch */
				switch (choicef) {
				case 1:
					FutureStudies fstd = new Engineering();
					fstd.studySubject();
					break;
				case 2:
					FutureStudies fstd0 = new Finance();
					fstd0.studySubject();
					break;
				case 3:
					FutureStudies fstd1 = new Literature();
					fstd1.studySubject();
					break;

				default:
					System.err.println("INVALID INPUT");
					break;
				}
				
				// BREAK POINT OF THIRD SWITCH
				break;
			case "no":
				System.exit(choice);
				break;

			default:
				System.err.println("UNWANTED OPTION DETECTED");
				break;
			}
			// BREAK POINT OF SECOND SWITCH
			break;
		case 2:
			EducationInsitiution course1 = new Commerce();
			course1.courseTaken();
			System.out.println("would you like to proceed further studies");
			System.out.println("yes  "+"  or  "+"  No  ");
			String choice02=input.next();
			
			// SECOND SWITCH STATEMENT
			switch (choice02) {
			case "yes":
				System.out.println("press enter choice for future studies"+"\n"+"press 1 to engineering"+"\n"+"press 2 to finance"+"\n"+"press 3 to literature");
				int choicef=input.nextInt();
				
				
				//THIRD SWITCH STATEMENTs 
				/*  Nested Switch inside case 1 of first switch */
				switch (choicef) {
				case 1:
					FutureStudies fstd = new Engineering();
					fstd.studySubject();
					break;
				case 2:
					FutureStudies fstd0 = new Finance();
					fstd0.studySubject();
					break;
				case 3:
					FutureStudies fstd1 = new Literature();
					fstd1.studySubject();
					break;

				default:
					System.err.println("INVALID INPUT");
					break;
				}
				
				// BREAK POINT OF THIRD SWITCH
				break;
			case "no":
				System.exit(choice);
				break;

			default:
				System.err.println("UNWANTED OPTION DETECTED");
				break;
			}
			// BREAK POINT OF SECOND SWITCH
			break;
		case 3:
			EducationInsitiution course3 = new Humanity();
			course3.courseTaken();
			System.out.println("would you like to proceed further studies");
			System.out.println("yes  "+"  or  "+"  No  ");
			String choice20=input.next();
			
			// SECOND SWITCH STATEMENT
			switch (choice20) {
			case "yes":
				System.out.println("press enter choice for future studies"+"\n"+"press 1 to engineering"+"\n"+"press 2 to finance"+"\n"+"press 3 to literature");
				int choicef=input.nextInt();
				
				
				//THIRD SWITCH STATEMENTs 
				/*  Nested Switch inside case 1 of first switch */
				switch (choicef) {
				case 1:
					FutureStudies fstd = new Engineering();
					fstd.studySubject();
					break;
				case 2:
					FutureStudies fstd0 = new Finance();
					fstd0.studySubject();
					break;
				case 3:
					FutureStudies fstd1 = new Literature();
					fstd1.studySubject();
					break;

				default:
					System.err.println("INVALID INPUT");
					break;
				}
				
				// BREAK POINT OF THIRD SWITCH
				break;
			case "no":
				System.exit(choice);
				break;

			default:
				System.err.println("UNWANTED OPTION DETECTED");
				break;
			}
			// BREAK POINT OF SECOND SWITCH
			break;

		default:
			System.err.println("WRONG INPUT");
			break;
		}
		//FIRST SWITCH CASE TERMINATED
		
	}
}
		
	


	

