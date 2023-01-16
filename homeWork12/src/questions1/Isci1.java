package questions1;



	class Isci1 extends Personel2 {
	    public Isci1(String isim, String soyisim, double maas) {
	        super(isim, soyisim, maas);
	   }

		
	    
	    
	    @Override
	    public void zamYap(double oran) {
	    	super.maas = super.maas * (1 + (oran + 0.1));
	    	
	    	System.out.println("ISCI "+super.isim + " " + super.soyisim + " icin yapilan zamli maas miktari: " + super.maas); 
	        
	    }
	    
	   
	}
	

