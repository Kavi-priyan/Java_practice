package June23.inh;

public class Bok {
	
	public Bok(String title, String author, double price) {
		super();
		Title = title;
		this.author = author;
		this.price = price;
	}

	String Title;
	String author;
	double price;
	
	void displayDetails() {
		System.out.println(Title);
		System.out.println(author);
		System.out.println(price);
	}

}
