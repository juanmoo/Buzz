
public class Player {
	private int totScore;
	private int wLit, wGeo, wHis, fArts, aLit, aGov, math, lSci, uHist, lightning, alphabet, pSci;
	private String name;
	
	public Player (String nam) {
		
		name = nam;
	}
	
	//Set Methods
	public void setWLit (int pts) {
		wLit += pts;
	}
	
	public void setWGeo (int pts) {
		wGeo += pts;
	}
	
	public void setWHis (int pts) {
		wHis += pts;
	}
	
	public void setFArts (int pts) {
		fArts += pts;
	}
	
	public void setALit (int pts) {
		aLit += pts;
	}
	
	public void setAGov (int pts) {
		aGov += pts;
	}
	
	public void setMath (int pts) {
		math += pts;
	}
	
	public void setLSci (int pts) {
		lSci += pts;
	}
	
	public void setUHist (int pts) {
		uHist += pts;
	}
	
	public void setLightning (int pts) {
		lightning += pts;
	}
	
	public void setAlphabet (int pts) {
		alphabet += pts;
	}
	
	public void setPSci (int pts) {
		pSci += pts;
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
	
	

}
