//import src.No;
//import src.Object;

public class ListaEncadeada {
	private No head;
	private No tail;
	
	public ListaEncadeada(){
		this.head = null;
		this.tail = null;
	}
  
	
	public boolean testeNull() {
		return (this.head == null);
	}
	
	
	/* Insere o objeto no fim da lista. */
    public void append(Object objeto) {
    	No no = new No(objeto);
    	if (this.testeNull()){
    		this.head = no;
    		head.setProximo(no);
    		no.setAnterior(head);
    		this.tail = no;
    		
    	}
    	else{
    		this.tail.setProximo(no);
    		no.setAnterior(tail);
    		no.setProximo(null);
    		this.tail = no;
    	}
    	
    }//Final append
    
  
	public void setHead(No head) {
		this.head = head;
	}



	public void setTail(No tail) {
		this.tail = tail;
	}


	/* Insere o objeto no inicio da lista. */
    public void addFirst(Object objeto) {	
    	No no = new No(objeto);
    	if (this.testeNull()){
	    	this.head = no;
	    	head.setProximo(head);
	    	head.setAnterior(null);
	    	this.tail = head;
    	
    	}
    	
    	else {
    		this.head.setAnterior(no);
    		no.setProximo(head);
    		no.setAnterior(null);
    		this.head = no;
    	}
    		
    	
	}
    /* Remove o objeto da lista. */
    public void remove(Object o) {
	}
    /* Recupera o primeiro No da lista. */
    public No getFirst() {
		return head;
	}
    /* Recupera o ultimo No da lista. */
    public No getLast() {
		return tail;
	}
    /* Testa se o objeto existe na lista. */
    public Object hasObject(Object objeto) {
		if (head != null);
    	return objeto;
	}
}
