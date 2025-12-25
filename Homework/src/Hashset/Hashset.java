package Hashset;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Hashset {
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hashset other = (Hashset) obj;
		return name == other.name;
	}
	
	
	
	
	
	
	int name=44;
public static void main(String[] args) {
	
	int[] arr= {12,33,44};
	Hashset n=new Hashset();
	HashSet set=new HashSet<>();
	set.add(90);
	set.add(78);
	set.add(78);
	set.add(new Hashset(43));
	set.add(new Hashset(43));
	

	System.out.println(set.contains(990));
	
	System.out.println(set);
}
public Hashset() {
	super();
}
public Hashset(int name) {
	super();
	this.name = name;
}
}
