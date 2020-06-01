
public class Main {

	public static void main(String[] args) {
		PersonNode mariaTree = populateTheTree();
		mariaTree.printTree(0);
		
		
	}

	
	private static PersonNode populateTheTree() {
		PersonNode treeRoot = new PersonNode("Maria", 1850);
		
		addChild(treeRoot, "Maria", "João", 1870);
		addChild(treeRoot, "Maria", "Ana", 1873);
		addChild(treeRoot, "Maria", "Joana", 1875);
		addChild(treeRoot, "Maria", "Aristites", 1880);
		addChild(treeRoot, "João", "William", 1888);
		addChild(treeRoot, "João", "Liliana", 1900);
		addChild(treeRoot, "Ana", "Roberto", 1898);
		addChild(treeRoot, "Ana", "Antonio", 1898);
		addChild(treeRoot, "Joana", "Pedro", 1900);
		addChild(treeRoot, "Aristites", "Ricardo", 1901);
		addChild(treeRoot, "William", "Lara", 1914);
		addChild(treeRoot, "Liliana", "Jose", 1923);
		addChild(treeRoot, "Liliana", "Toy", 1926);
		addChild(treeRoot, "Antonio", "Claudio", 1918);
		
		return treeRoot;
	}


	private static void addChild(PersonNode treeRoot, String parent, String child, int year) {
		treeRoot.addChildToPerson(parent, new PersonNode(child, year));
	}
}
