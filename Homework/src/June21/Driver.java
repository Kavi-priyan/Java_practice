package June21;

public class Driver {
	public static void main(String[] args) {
		MathTeacher m=new MathTeacher();

        System.out.println("Accessing static member from subclass: " + MathTeacher.name);
		m.displayName();
		m.teach();
	}

}
