import java.util.ArrayList;
import java.util.Scanner;

public class FttAcumulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("FTT Acumulador");
		System.out.println("eae parça");
		//System.out - standard output
		//Sustem.in - standard input
		//Sustem.err - standard error
		ArrayList<String> userMesssages = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int acumulador = 0;
		
		while(sc.hasNext()){
			String userText = sc.nextLine();
			if(userText.isEmpty())
				break;
			try
			{
				acumulador += Integer.valueOf(userText);			
			}catch(Exception e){
				userMesssages.add(userText);
				System.err.println("Ops!!");
				e.printStackTrace();
			
			}
			System.out.println("Texto: "+acumulador);
		}
		for(int x=0; x< userMesssages.size(); x++)
			System.out.println(userMesssages.get(x));
		
		sc.close();
		

	}

}
