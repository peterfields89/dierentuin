package dagEen;

public class dierenapp {	
	public static void main(String[] args) {
		
		Leeuw simba = new Leeuw();
		dierenarts Els = new dierenarts(); 
		
		System.out.println(simba.leeftijd);
		
		Els.betermaken(simba);
		System.out.println(simba.leeftijd);
		
	}
}

class dierenarts{
	
	void betermaken(Leeuw deLeeuw) {
		deLeeuw.leeftijd += 1;
		System.out.println("de leeuw is beter");
		
	}
	
}

class Leeuw{
	String leeuwen = "Simba";
	int leeftijd = 1; 

	
	
	void open() {
		System.out.println("De dierentuin met de leeuw "+leeuwen+" is open");
		
	}
	
}
