package June23.inh;

public class Ebook extends Bok{
	public Ebook(String title, String author, double price,int fileSize) {
		super(title, author, price);
		this.fileSize = fileSize;
	}

	int fileSize;
	
	void display() {
		System.out.println(super.Title);
		System.out.println(super.author);
		System.out.println(super.price);
		System.out.println(fileSize);
		
	}
	
	
	

}
