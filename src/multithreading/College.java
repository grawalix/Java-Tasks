package multithreading;

class Student{
	void Course_Details() {
		System.out.println("student course details");
	}


}

class Science extends Student{
	public void Science_Details() {
		System.out.println("science taken");
	}
}

class Commerce extends Student{
	void Commerce_Details() {
		System.out.println("commerce taken");
	}
}

class Humanity extends Student{
	void Humanity_Details() {
		System.out.println("Humanity taken");
	}
}

class Engineering extends Student{
	void Engineering_Details() {
		System.out.println("enginnering taken");
	}
}

class Literature extends Student{
	void Literature_Details() {
		System.out.println("literature taken");
	}
}

class Finance extends Student{
	void Finance_Details() {
		System.out.println("Finance taken");
	}
}
public class College {
   public static void main(String[] args) {
	   System.out.println(" Student course details");
	Science s=new Science();
	s.Science_Details();
	
		Commerce c=new Commerce();
		c.Commerce_Details();
		
		Humanity h=new Humanity();
		h.Humanity_Details();
		
		Engineering e=new Engineering();
		e.Engineering_Details();
		
		Literature l=new Literature();
		l.Literature_Details();
		
		Finance f=new Finance();
		f.Finance_Details();
	
	
	
}
}
