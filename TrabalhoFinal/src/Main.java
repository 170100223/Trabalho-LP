
public class Main {

	public static void main(String[] args) {
		PersonNode mariaTree = populateTheTree();
		mariaTree.printTree();
		
		System.out.println();
		System.out.println("pergunta: Tem um filho com o nome Aristites?");
		System.out.println("resposta:" + mariaTree.containsChild("Aristites"));
		
		System.out.println();
		System.out.println("pergunta: Qual o ano de nascimento do Toy?");
		PersonNode toy = mariaTree.getPerson("Toy");
		if (toy != null) {
			System.out.println("resposta:" + toy.getYear());
		}
		else {
			System.out.println("Toy nao pertence a familia");
		}
		
		System.out.println();
		System.out.println("pergunta: Qual o grau parentesco da Ana?");
		System.out.println("resposta:" + mariaTree.getParentalDegree("Ana"));
		

		System.out.println();
		System.out.println("Pedro teve mais um filho");
		mariaTree.addChildToPerson("Pedro", new PersonNode("Isis", 1927));
		mariaTree.printTree();
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
