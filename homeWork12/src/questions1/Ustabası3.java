package questions1;



	class Ustabasi3 extends Personel2 {
	    public Ustabasi3(String isim, String soyisim, double maas) {
	        super(isim, soyisim, maas);
	    }
	    
	    public void zamYap(double oran) {
	    	super.maas = super.maas * (1 + (oran + 0.2));
	    	System.out.println("USTABASI "+super.isim + " " + super.soyisim + " icin yapilan zamli maas miktari: " + super.maas); 
	        
	    }
	    
	    
	}
	
	

