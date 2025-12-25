package Jun4;

class Animal {
    String type;
    public static void overLoad(int a)
	{
		System.out.println(a);
	}
	public static void overLoad(char ch)
	{
		System.out.println(ch);
	}

    Animal getAnimal() {
        Animal a = new Animal();
        a.type = "Mammal";
        return a;
    }

    public static void main(String[] args) {
        Animal a = new Animal();       // Creates a new Animal object (a)
        Animal b = a.getAnimal();      // Calls getAnimal() which returns a new Animal with type = "Mammal"
        System.out.println(a.type);
        overLoad((char)(97+1));

		
// Prints the type of the new Animal object
    }
}
