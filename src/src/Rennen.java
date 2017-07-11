package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Rennen {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Wählen Sie den Wetttypen: ");
			
			ArrayList<String> wt = new ArrayList<>();
			wt.add("(W)IN");//1 - 0
			wt.add("(P)LACE");//1 - 1
			wt.add("(S)HOW");//1 - 2 
			wt.add("(E)XACTA");//2 - 3
			wt.add("(T)RIFECTA");//3 - 4
			wt.add("(SU)PERFECTA");//4 - 5
			int type = 999;
			
			ArrayList<String> pf = new ArrayList<>();
			pf.add("(F)usaichi");
			pf.add("(B)ig Brown");
			pf.add("(S)hareef Dancer");
			pf.add( "(P)alloubet d'Halong");
			pf.add( "(G)reen Monkey");
			pf.add( "(T)otilas");
			pf.add( "(B)ella Donna");
			ArrayList<String> ausgewaehltePferde = new ArrayList<>();
			
			for(String t : wt){
				System.out.println(t);
			}
			
			String winput = scan.next();
			
			
			for(String t : wt){
				String bIk = t.split("\\)")[0].replaceAll("\\(", ""); //bIk == Buchstabe in Klammer // bei ) splitten
				if(winput.equalsIgnoreCase(bIk)){
					type = wt.indexOf(t);
					System.out.println("Sie haben " + t + " ausgewählt!");
				}
			}
			
			if(type < 3){
				//1 Pferd auswählen
				System.out.println("Wählen Sie das Pferd: ");
			}else if(type > 3 && type < 5){
				//mehrere Pferde auswählen
				System.out.println("Wählen Sie die Pferde: ");
			}else if(type > 5){
				System.out.println("Sie haben keinen Wetttypen ausgewählt!");
			}


			for(int i = 0; i < pf.size(); i ++){
				System.out.println(pf.get(i));
			}
			
			ausgewaehltePferde.add(scan.next()); 
			if(type >= 3){
				for(int i = 0;i< type-2;i++){
					ausgewaehltePferde.add(scan.next());
				}
			}
			
			for(String t:ausgewaehltePferde){
				System.out.println(t);
			}
			
	}
}

