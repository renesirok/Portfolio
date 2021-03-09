import java.util.*;
public class Nal3{
	public enum Dnevi{pon, tor, sre, cet, pet, sob, ned};
		String dan;
		
	public Nal3(){
		this.dan="pondelk";
	}
	
	
	public static void main(String[]args){
		vzdusje();
		Nal3 obj=new Nal3();
		System.out.println("Konstruktor: "+ obj);
	}
	
	public static void vzdusje(){
		System.out.println("Dnevi v tednu: ");
		
		for(Dnevi d:Dnevi.values())
			System.out.println(d);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Poljuben dan v tednu");
		String x=sc.next();
		switch(x.toLowerCase()){
			case "ponedeljek": System.out.println("Pond mi niso vsec");break;
			case "torek":
			case "sreda":
			case "cetrtek":System.out.println("med tednom je tako tako"); break;
			case "petek":System.out.println("petki so v redu");break;
			case "sobota":
			case "nedelja": System.out.println("vikendi so najaci");break;
			
			default: System.out.println("Napacen vnos");
		}
	}
}
			
			
			
			
			
			
			
			
			
		