
public class Main {
	public static void main(String[] args) throws Exception {
		Autor autor = new Autor("Ion Creanga");
		Autor autor2 = new Autor("Mihai Eminescu");
		
		Cuprins cuprins = new Cuprins("nume cuprins");
		
		Carte carte = new Carte("Impreuna"	, cuprins);
		carte.addAutor(autor);
		carte.addAutor(autor2);
		Sectiune s1 = new Sectiune("Strada");
		s1.add(new Imagine("strada.jpg"));

		s1.add(new Paragraf("Acesta este paragraful 1", carte.centerAlignment));
		s1.add(new Paragraf("Acesta este paragraful 2", carte.leftAlignment));
		s1.add(new Paragraf("Acesta este paragraful 3", carte.leftAlignment));
		
		Sectiune s2 = new Sectiune("Campia");
		s2.add(new Imagine("campia.jpg"));
		s2.add(new Paragraf("Acesta este paragraful 4", carte.rightAlignment));
		s2.add(new Paragraf("Acesta este paragraful 5", carte.rightAlignment));

		carte.addCapitol(s1);
		carte.addCapitol(s2);

		carte.print();
	}
}
