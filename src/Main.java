//import stuff to make this s  work
import java.util.*;
import javax.swing.*;
import java.io.*; 

public class Main {
	static String file_name;
	
	//The more space the cooler we are :sunglasses:
	
	
	public static void klientainfo_output (){	//Print out the nonworking stuff 	
		String teksts;
		try{
			file_name = JOptionPane.showInputDialog("pasutijums: ");
			FileReader fr = new FileReader(file_name);
			BufferedReader lasa = new BufferedReader(fr);
			while((teksts=lasa.readLine())!=null){
				System.out.println(teksts);
			}
			lasa.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Nav atrodams tada izvele", "Error!", JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void klientainfo_input(){//lets input this dudes info so we can stalk him
		try{			
			JTextField vards = new JTextField();
			JTextField adrese = new JTextField();
			JTextField telefons = new JTextField();
			Object[] message = {"Pasutitaja vards:", vards,"Pasutitaja adrese:", adrese,"Pasutitaja numurs:", telefons};
			int answer = JOptionPane.showConfirmDialog(null, message, "Pasutitaja informacija: ", JOptionPane.OK_OPTION);
			if (answer == JOptionPane.OK_OPTION){    
			FileWriter ryt = new FileWriter(vards.getText());
			BufferedWriter out=new BufferedWriter(ryt);
			out.write("Pasutitaja vards: " +vards.getText()+"\n");
			out.write("Pasutitaja adrese: " +adrese.getText()+"\n");
			out.write("Pasutitaja numurs: " +telefons.getText()+"\n");
			out.close();
			JOptionPane.showMessageDialog(null, "Informacija ir saglabata");			
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Nav atrodams tada izvele", "Error!", JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void main(String[] args) {//Main void..... what did u expect
		String picasIzvele;	
		do {
			JOptionPane.showMessageDialog(null, "Pizzas edienu karte","",JOptionPane.INFORMATION_MESSAGE);
			picasIzvele = JOptionPane.showInputDialog("|1-Pasutitaja info |\n|2-apskatīt Pasutitaja info |\n|3-pasūtīt|\n|Exit-close|");
			picasIzvele = picasIzvele.toLowerCase();// So we can exit this  and dsoent give us error 
			switch(picasIzvele) {
			case "1":
				klientainfo_input();
			break;
			case "2":
				klientainfo_output();
			break;
			case "3":
				String izvele, picasIzmers;
				int klientaIzvele=0;
				double rekins = 0;				
				picasIzmers =  JOptionPane.showInputDialog(null,"1 - Lielā\n2 - Videjā\n3 - mazā","Piccas lielums",JOptionPane.PLAIN_MESSAGE);
				klientaIzvele = Integer.parseInt(picasIzmers);
				switch(klientaIzvele) {
				case 1:rekins  = 15.80; break;//The bigger the expensive
				case 2:rekins  = 12.50; break;
				case 3:rekins  = 9.70; break;//The smaller the cheaper				
				}							
				izvele =  JOptionPane.showInputDialog(null, "1 - Kalifornijas pica \n2 - Siera pica\n3 - Pikantā pica\n4 - Lauku pica","Izvēlies savu picu:",JOptionPane.PLAIN_MESSAGE);
				klientaIzvele = Integer.parseInt(izvele);
				switch(klientaIzvele) {
				case 1:rekins  += 1.20; break;//More toppings more paying
				case 2:rekins  += 1.00; break;
				case 3:rekins  += 1.30; break;
				case 4:rekins  += 1.50; break;
				}				
				izvele = JOptionPane.showInputDialog(null,"1 - Jā\n2- Nē","Vai vēleis dzērienu?",JOptionPane.PLAIN_MESSAGE);
				klientaIzvele = Integer.parseInt(izvele);
				 if(klientaIzvele == 1)
					rekins += 0.90;
				 else;//Lazy fix for other options so it dosent give us error				 
				izvele = JOptionPane.showInputDialog(null,"1 - Jā\n2- Nē","Vai vēleis piedavas?",JOptionPane.PLAIN_MESSAGE);
				klientaIzvele = Integer.parseInt(izvele);
				 if(klientaIzvele == 1)
					rekins += 1.20;
				 else;;//Lazy fix for other options so it dosent give us error				 
				izvele = JOptionPane.showInputDialog(null,"1 - Jā\n2- Nē","Vai pasūtījumu vajadzēs piegādāt",JOptionPane.PLAIN_MESSAGE);
				klientaIzvele = Integer.parseInt(izvele);
				 if(klientaIzvele == 1)
					rekins += 3.00;
				 else;;//Lazy fix for other options so it dosent give us error				 
				 JOptionPane.showMessageDialog(null,"Summa: " + rekins );
				break;
			case "exit":
				JOptionPane.showMessageDialog(null, "Programma tiek aptureta", "Exiting...", JOptionPane.WARNING_MESSAGE);
				break;
			default: 
		 		JOptionPane.showMessageDialog(null, "Nav atrodams tada izvele", "Error!", JOptionPane.ERROR_MESSAGE);
		 	break;
			}
		}while(!picasIzvele.equals("Exit"));//WOW so advanced we have exit

	}

}
