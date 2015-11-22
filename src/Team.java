
public class Team {
	public Player p1;
	public Player p2;
	public Player p3;
	public Player p4;
	private String name;
	private int wLit, wGeo, wHis, fArts, aLit, aGov, math, lSci, uHist, lightning, alphabet, pSci;
	private int totScore;
	
	public Team (String nm, String n1, String n2, String n3, String n4) {
		name = nm;
		p1 = new Player(n1);
		p2 = new Player(n2);
		p3 = new Player(n3);
		p4 = new Player(n4);
		
	}
	//UPDATING METHODS
	public void calcMath () {
		math = p1.getMath() + p2.getMath() + p3.getMath() + p4.getMath();
	}
	
	public void calcWLit () {
		wLit = p1.getWLit() + p2.getWLit() + p3.getWLit() + p4.getWLit();
	}
	
	public void calcWGeo () {
		wGeo = p1.getWGeo() + p4.getWGeo() + p3.getWGeo() + p2.getWGeo();
	}
	
	public void calcWHis () {
		wHis = p1.getWHis() + p2.getWHis() + p3.getWHis() + p4.getWHis();
	}
	
	public void calcFArts () {
		fArts = p1.getFArts() + p2.getFArts() + p3.getFArts() + p4.getFArts();
	}

	public void calcALit() {
		aLit = p1.getALit() + p2.getALit() + p3.getALit() + p4.getALit();
	}
	
	public void calcAGov() {
		aGov = p1.getAGov() + p2.getAGov() + p3.getAGov() + p4.getAGov();
	}
	
	public void calcLSci() {
		lSci = p1.getLSci() + p2.getLSci() + p3.getLSci() + p4.getLSci();
	}
	
	public void calcUHist () {
		uHist = p1.getUHist() + p2.getUHist() + p3.getUHist() + p4.getUHist();
	}
	
	public void calcLightning () {
		lightning  = p1.getLightning() + p2.getLightning() + p3.getLightning() + p4.getLightning();
	}
	
	public void calcAlphabet() {
		alphabet = p1.getAlphabet() + p2.getAlphabet() + p3.getAlphabet() + p4.getAlphabet();
	}
	
	public void calcPSci() {
		pSci = p1.getPSci() + p2.getPSci() + p3.getPSci() + p4.getPSci();
	}
	
	public void update () {
		calcWLit();
		calcMath();
		calcWGeo();
		calcWHis();
		calcFArts();
		calcALit();
		calcAGov();
		calcLSci();
		calcUHist();
		calcLightning();
		calcAlphabet();
		calcPSci();
		calTot();
		
	}
	
	//Set Methods
		public void setWLit (int p, int pts) {
			if (p == 1) p1.setWLit(pts);
			else if (p == 2) p2.setWLit(pts);
			else if (p == 3) p3.setWLit(pts);
			else if (p == 4) p4.setWLit(pts);
		}
		
		
		public void setWGeo (int p, int pts) {
			if (p == 1) p1.setWGeo(pts);
			else if (p == 2) p2.setWGeo(pts);
			else if (p == 3) p3.setWGeo(pts);
			else if (p == 4) p4.setWGeo(pts);
		}
		
		public void setWHis (int p, int pts) {
			if (p == 1) p1.setWHis(pts);
			else if (p == 2) p2.setWHis(pts);
			else if (p == 3) p3.setWHis(pts);
			else if (p == 4) p4.setWHis(pts);
		}
		
		public void setFArts (int p, int pts) {
			if (p == 1) p1.setFArts(pts);
			else if (p == 2) p2.setFArts(pts);
			else if (p == 3) p3.setFArts(pts);
			else if (p == 4) p4.setFArts(pts);
		}
		
		public void setALit (int p, int pts) {
			if (p == 1) p1.setALit(pts);
			else if (p == 2) p2.setALit(pts);
			else if (p == 3) p3.setALit(pts);
			else if (p == 4) p4.setALit(pts);
		}
		
		public void setAGov (int p, int pts) {
			if (p == 1) p1.setAGov(pts);
			else if (p == 2) p2.setAGov(pts);
			else if (p == 3) p3.setAGov(pts);
			else if (p == 4) p4.setAGov(pts);
		}
		
		public void setMath (int p, int pts) {
			if (p == 1) p1.setMath(pts);
			else if (p == 2) p2.setMath(pts);
			else if (p == 3) p3.setMath(pts);
			else if (p == 4) p4.setMath(pts);
		}
		
		public void setLSci (int p, int pts) {
			if (p == 1) p1.setLSci(pts);
			else if (p == 2) p2.setLSci(pts);
			else if (p == 3) p3.setLSci(pts);
			else if (p == 4) p4.setLSci(pts);
		}
		
		public void setUHist (int p, int pts) {
			if (p == 1) p1.setUHist(pts);
			else if (p == 2) p2.setUHist(pts);
			else if (p == 3) p3.setUHist(pts);
			else if (p == 4) p4.setUHist(pts);
		}
		
		public void setLightning (int p, int pts) {
			if (p == 1) p1.setLightning(pts);
			else if (p == 2) p2.setLightning(pts);
			else if (p == 3) p3.setLightning(pts);
			else if (p == 4) p4.setLightning(pts);
		}
		
		public void setAlphabet (int p, int pts) {
			if (p == 1) p1.setAlphabet(pts);
			else if (p == 2) p2.setAlphabet(pts);
			else if (p == 3) p3.setAlphabet(pts);
			else if (p == 4) p4.setAlphabet(pts);
		}
		
		public void setPSci (int p, int pts) {
			if (p == 1) p1.setPSci(pts);
			else if (p == 2) p2.setPSci(pts);
			else if (p == 3) p3.setPSci(pts);
			else if (p == 4) p4.setPSci(pts);
		}
		
		//Accesor Methods
		
		public int getWLit () {
			return wLit;
		}
		
		public int getWGeo () {
			return wGeo;
		}
		
		public int getWHis () {
			return wHis;
		}
		
		public int getFArts () {
			return fArts;
		}
		
		public int getALit () {
			return aLit;
		}
		
		public int getAGov () {
			return aGov;
		}
		
		public int getMath () {
			return math;
		}
		
		public int getLSci () {
			return lSci;
		}
		
		public int getUHist () {
			return uHist;
		}
		
		public int getLightning () {
			return lightning;
		}
		
		public int getAlphabet () {
			return alphabet;
		}
		
		public int getPSci () {
			return pSci;
		}
		
		//Calculates Total
		
		public void calTot () {
			totScore = wLit + wGeo + wHis + fArts + aLit + aGov + math + lSci + uHist + lightning + alphabet + pSci;
		}
		
		public int getTot() {
			return totScore;
		}
		
		//Returns name
		
		public String getName() {
			return name;
		}
		
		//Returns name of specific player
		public String getPName(int player) {
			switch (player) {
case 1: return p1.getName();
			
			case 2: return p2.getName();
			
			case 3: return p3.getName();
			
			case 4: return p4.getName();
			
			case 5: return p1.getName();
			
			case 6: return p2.getName();
			
			case 7: return p3.getName();
			
			case 8: return p4.getName();
			
			default: return "";
			}
			 
		}
		
}
