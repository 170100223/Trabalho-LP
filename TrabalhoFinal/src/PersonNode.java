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
	 * Procura um filho com um determinado nome na arvore
	 * @param name
	 * @return true se existir e false caso contrario
	 */
	public boolean containsChild(String name) {
		for (int i = 0; i < childrens.size(); i++) {
			PersonNode child = childrens.get(i);
			if(name.equals(child.getName())) {
				return true;
			}
		}
		return false;
	}
	/**
	 * Adiciona filho a arvore
	 * @param newChild
	 */
	public void addChild(PersonNode newChild) {
		childrens.add(newChild);
	}
	
	/**
	 * get people qualquer pessoa da arvore
	 * @param name
	 * @return
	 */
	public PersonNode getPerson(String name) {
		if(name.equals(getName())) {
			return this;
		}
		for (int i = 0; i < childrens.size(); i++) {
			PersonNode child = childrens.get(i);
			PersonNode result = child.getPerson(name);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
	
	/**
	 * devolve o grau parentesco dos filhos
	 * @param name nome do filho que queremos saber
	 * @return se encontrar o nome retorna o grau parentesco se nao encontrar retorna -1
	 */
	public int getParentalDegree(String name) {
		return getParentalDegree(name, 0);
	}
	
	private int getParentalDegree(String name, int degree) {
		if(name.equals(getName())) {
			return degree;
		}
		for (int i = 0; i < childrens.size(); i++) {
			PersonNode child = childrens.get(i);
			int result = child.getParentalDegree(name, degree + 1);
			if (result != -1) {
				return result;
			}
		}
		return -1;
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

	public void printTree() {
		printTree(0);
	}
	
	private void printTree(int degree) {
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
