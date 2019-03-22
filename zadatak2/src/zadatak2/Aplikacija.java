package zadatak2;

public class Aplikacija {

	public static void main(String[] args) {
		Televizor tv=new Televizor();
		Televizor tv1=new Televizor(Stanje.UKLJUCEN, 30, 5);
		System.out.println(tv.ukljuci());
		System.out.println(tv1.ukljuci());
		System.out.println(tv.iskljuci());
		System.out.println(tv1.iskljuci());
		System.out.println(tv.pokvari());
		System.out.println(tv1.pokvari());
		System.out.println(tv.popravi());
		System.out.println(tv1.popravi());
		System.out.println(tv.pojacajZvuk());
		System.out.println(tv1.pojacajZvuk());
		System.out.println(tv.promeniKanal(2));
		System.out.println(tv1.promeniKanal(6));
	}

}
