import java.util.ArrayList;

/**
 * 
 * @author Diogo Nogueira 170100223, João Agostinho 170100278
 *
 */
public class PersonNode {
	//Atributos
	private String name;
	private int year;
	private ArrayList<PersonNode> childrens = new ArrayList<PersonNode>();
	

	//Contrutores
	public PersonNode(String name, int year) {
		this.name=name;
		this.year=year;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	
	//metodos
	
	
	@Override
	public String toString() {
		return getName() + "(" + getYear() + ")";
	}
	
	
	
}
