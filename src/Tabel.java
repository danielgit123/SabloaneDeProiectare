
public class Tabel extends AbstractElement{
	private String nume;

	public Tabel(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void print() {
		System.out.println("Tabel [nume=" + nume + "]");
		
	}

}
