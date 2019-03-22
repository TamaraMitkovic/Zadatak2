package zadatak2;

public class Televizor {
	private Stanje stanje;
	private int jacinaZvuka;
	private int trenutniKanal;
	public Televizor() {
		super();
		stanje=Stanje.ISKLJUCEN;
		jacinaZvuka=-1;
		trenutniKanal=-1;
	}
	public Televizor(Stanje stanje, int jacinaZvuka, int trenutniKanal) {
		super();
		this.stanje = stanje;
		this.jacinaZvuka = jacinaZvuka;
		this.trenutniKanal = trenutniKanal;
	}
	public Stanje getStanje() {
		return stanje;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public int getTrenutniKanal() {
		return trenutniKanal;
	}
	public boolean ukljuci() {
		if(stanje!=Stanje.POKVAREN) {
			stanje=Stanje.UKLJUCEN;
			jacinaZvuka=0;
			trenutniKanal=0;
			return true;
		}
		else return false;
	}
	public boolean iskljuci() {
		if(stanje!=Stanje.POKVAREN) {
			stanje=Stanje.ISKLJUCEN;
			jacinaZvuka=-1;
			trenutniKanal=-1;
			return true;
		}
		else return false;
	}
	public boolean pokvari() {
		if(stanje!=Stanje.POKVAREN) {
			stanje=Stanje.POKVAREN;
			return true;
		}
		else return false;
	}
	public boolean popravi() {
		if(stanje==Stanje.POKVAREN) {
			stanje=Stanje.ISKLJUCEN;
			jacinaZvuka=-1;
			trenutniKanal=-1;
			return true;
		}
		else return false;
	}
	public boolean pojacajZvuk() {
		if(stanje==Stanje.UKLJUCEN && jacinaZvuka<100) {
			jacinaZvuka++;
			return true;
		}
		else return false;
	}
	public boolean smanjiZvuk() {
		if(stanje==Stanje.UKLJUCEN && jacinaZvuka>=0) {
			jacinaZvuka--;
			return true;
		}
		else return false;
	}
	public boolean promeniKanal(int noviKanal) {
		if(stanje==Stanje.UKLJUCEN && noviKanal>0 && noviKanal<10) {
			trenutniKanal=noviKanal;
			return true;
		}
		else return false;
	}
}
