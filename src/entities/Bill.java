package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		if (this.feeding() > 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	public double feeding() {
		return (this.beer * 5.0) + (this.softDrink * 3.0) + (this.barbecue * 7.0);
	}

	public double ticket() {
		return (this.gender == 'F') ? 8.0 : 10.0;
	}

	public double total() {
		return (this.feeding() + this.ticket() + this.cover());
	}
}
