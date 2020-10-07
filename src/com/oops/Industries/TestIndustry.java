package com.oops.Industries;

import java.util.Scanner;

import javax.crypto.CipherInputStream;

public class TestIndustry {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to TATA Industries");
		System.out.println("Enter your choice to know information about our industries");
		Scanner in = new Scanner(System.in);
		System.out.println("Industries are"+"\n"+"press 1 for ChemicalIndustry"+"\n"+"press 2 for ConsumerProducts"+"\n"+"press 3 for EnergyIndustry"+"\n"+"press 4 for Services"+"\n"+"press 5 for EngineeringIndustry"+"\n"+"press 6 for Materials"+"\n"+"press 7 for InformationSystems");
        int choice=in.nextInt();
       

        
        switch (choice) {
        
        //Chemical Industries
		case 1:
			System.out.println("Welcome to TATA Chemicals");
			System.out.println("would you like to proceed for further information");
			System.out.println("press 1 for Organic Chemicals"+"\n"+"press 2 for Agricultural Chemicals"+"\n"+"press 3 for Miscalleaneous Chemicals");
			int choice2=in.nextInt();
			
			switch (choice2) {
			case 1:
				ChemicalIndustry cmi=new OrganicChemicals();
				cmi.chemicals();
				break;
				
			case 2:
				ChemicalIndustry cmi1=new AgriculturalChemicals();
				cmi1.chemicals();
				
			case 3:
				ChemicalIndustry cmi2=new MiscallaneousChemicals();
				cmi2.chemicals();

			default:
				break;
			}
			break;
			
			//Consumer Products
		    case 2:
			System.out.println("Welcome to TATA Consumer Products");
			System.out.println("would you like to proceed for further information");
			System.out.println("press 1 for  Shopping Products"+"\n"+"press 2 for Convenience Products");
            int choice3=in.nextInt();
            
            switch (choice3) {
			case 1:
				ConsumerProducts cmp=new ShoppingProducts();
				cmp.consumer();
				break;
			case 2:
				ConsumerProducts cmp1= new ConvenienceProducts();
				cmp1.consumer();
				break;

			default:
				break;
			}
			
			break;
			
			//Energy Industry
		case 3:
			System.out.println("Welcome to TATA Energy");
			System.out.println("would you like to proceed for further information");
			System.out.println("press 1 for  Renewable Energy"+"\n"+"press 2 for Non Renewable Energy");
            int choice4=in.nextInt();
            
            switch (choice4) {
			case 1:
				EnergyIndustry eg=new RenewableEnergy();
				eg.energy();
				break;
				
				case 2:
					EnergyIndustry eg1=new NonRenewableEnergy();
					eg1.energy();
					break;

			default:
				break;
			}
            
			break;
			
			//Services Industry
		case 4:
			System.out.println("Welcome to TATA Services");
			System.out.println("would you like to proceed for further information");
			System.out.println("press 1 for Finance Services"+"\n"+"press 2 for Transport Services");
			int choice5=in.nextInt();
			
			switch (choice5) {
			case 1:
				Services ser =new FinanceServices();
				ser.services();
				break;
				
				case 2:
					Services ser1 =new TransportServices();
					ser1.services();
					break;

			default:
				break;
			}
			
			break;
			
			//Enginnering Industry
		case 5:
		System.out.println("Welcome to TATA Engineering");
			System.out.println("would you like to proceed for further information");
			System.out.println("press 1 for Mechanical Engineering"+"\n"+"press 2 for Computer Engineering");
			int choice6=in.nextInt();
			
		switch (choice6) {
		case 1:
			EngineeringIndustry eng = new MechanicalEngineering();
			eng.engineering();
			break;
			
			case 2:
				EngineeringIndustry eng1 = new ComputerEngineering();
				eng1.engineering();
                 break;
		default:
			break;
		}
			
			break;
			
			//Materials Industry
		case 6:
			System.out.println("Welcome to TATA Materials");
			System.out.println("would you like to proceed for further information");
			System.out.println("press 1 for Finished Materials"+"\n"+"press 2 for Unfinished Materials");
			int choice7=in.nextInt();
			
			switch (choice7) {
			case 1:
				Materials mat=new FinishedMaterials();
				mat.materials();
				break;
				
			case 2:
				Materials mat1= new UnfinishedMaterials();
				mat1.materials();
				break;

			default:
				break;
			}
			
			break;
			
			//Information Industry
		case 7:
			System.out.println("Welcome to TATA Information Systems");
			System.out.println("would you like to proceed for further information");
			System.out.println("press 1 for Hardware"+"\n"+"press 2 for Software");
			int choice8=in.nextInt();
			
			switch (choice8) {
			case 1:
				InformationSystems inf = new HardwareSystems();
				inf.informationSystems();
				break;
				
			case 2:
				InformationSystems inf1 = new SoftwareSystems();
				inf1.informationSystems();
				break;

			default:
				break;
			}
			
			break;

		default:
			break;
		}
		
	}

}
