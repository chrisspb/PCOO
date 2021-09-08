class PoupeeRusse { 
	int taille; 
	boolean ouverte; 
	PoupeeRusse dans, contient; 
	PoupeeRusse(int taille) { 
		this.taille = taille; 
		this.ouverte = false; 
	} 
	
	void ouvrir() { 
		
		if(!this.ouverte && this.dans==null) 
			this.ouverte = true; 
	} 
	
	
	
	void fermer() { 
		
		if(this.ouverte && this.dans == null) 
			this.ouverte = false; 
	
	} 
	
	
	void placerDans(PoupeeRusse p) { 
		
		if(!this.ouverte && this.dans == null && p.ouverte && p.contient == null && p.taille> this.taille) { 
			this.dans = p; 
			p.contient = this; 
		} 
		
	} 
	
	void sortirDe(PoupeeRusse p) { 
		
		if(p.ouverte && p.contient == this) { 
			this.dans = null; 
			p.contient = null; 
		} 
		
	} 
	
}