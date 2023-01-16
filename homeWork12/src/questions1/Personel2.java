package questions1;

/*
1.	Bir isyerinde calisan farkli gruplarda personel var.  Birtane Base class olacak sekilde bunlari siniflandiriniz. 
(Personel-isci-ustabasi gibi)
2.	Bu personellere farkli oranlarda zam yapilacaktir. (Override yaparak kullanmaniz istenmektedir)
3.	Bu uygulmayi olusturunuz.

*/
	class Personel2 {
		
		
		
	    public String isim;
	    public String soyisim;
	    public double maas;

	    public Personel2(String isim, String soyisim, double maas) {
	    
	    	
	        this.isim = isim;
	        this.soyisim = soyisim;
	        this.maas = maas;
	    }
	 
	    
	    public void zamYap(double oran) {
	      
	    	this.maas=this.maas*(1+oran);
	    	
	        System.out.println(this.isim + " " + this.soyisim + " icin yapilan zam miktari: " + this.maas);  
 
	        
	        
	    }
		 
	        
	    }
	    
	    
	    
	    
	

	


