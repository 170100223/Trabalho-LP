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
	
	/**
	 * adiciona filho
	 * @param newChild
	 */
	public void addChild(PersonNode newChild) {
		childrens.add(newChild);
	}
	
	/**
	 * adicionar filho a pessoa que queremos
	 * @param name pessoa que queremos dar um filho
	 * @param newChild  
	 */
	public void addChildToPerson(String name, PersonNode newChild) {
		if(name.equals(getName())) {
			addChild(newChild);
		}
		for (int i = 0; i < childrens.size(); i++) {
			PersonNode child = childrens.get(i);
			child.addChildToPerson(name, newChild);
		}
	}
	
	@Override
	public String toString() {
		return getName() + "(" + getYear() + ")";
	}
	
	public void printTree(int degree) {
		printNTab(degree);
		System.out.println(toString());
		for (int i = 0; i < childrens.size(); i++) {
			PersonNode child = childrens.get(i);
			child.printTree(degree + 1);
		}
	}
	
	private void printNTab(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\t");
		}
	}
	
}
