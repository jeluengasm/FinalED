package datos;



public class Node {
	
	Node next = null; //Pointer
        Beneficiario Ben;
        Lider Lid;
	
	public Node() {}

    public Node(Beneficiario Ben) {
        this.Ben = Ben;
    }

    public Node(Lider Lid) {
        this.Lid = Lid;
    }
        
	
    public String toString()
    {
            return "... \n";
    }

    public Node cloneL()
    {
            Node temp = new Node(this.Lid);
            return temp;
    }

    public Node cloneB()
    {
            Node temp = new Node(this.Ben);
            return temp;
    }
}