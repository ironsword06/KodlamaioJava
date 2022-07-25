package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		//camelCase
		//DRY!!
		String internetSubeButonu="İnternet Şubesi";
	    System.out.println(internetSubeButonu);
	    
	    double dolarDun = 8.15;
	    double dolarBugun = 8.15;
	    int vade =36;
	    boolean dustuMu = false;
	  
	    if (dolarBugun<dolarDun) {
	    	System.out.println("Dolar Düştü");
			
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar Yükseldi");
		}
	    
	    else {
			System.out.println("değişmedi");
		}
	    
	    String[] krediler = {"hızlı kredi","mutlu emekli","msb kredisi","çiftci kredisi" };
	    for (String kredi : krediler) {                //foreach döngüsü
	    	System.out.println(kredi);
	    }
	    for(int i =0; i<krediler.length;i++) {          //ikisi de aynı işlemi görüyor 
	    	System.out.println(krediler[i]);
	    }
	    
	}
	
	

}
