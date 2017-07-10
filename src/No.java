//import src.No;
//import src.Object;

public class No {
	private No anterior;
    private Object object;
    private No proximo;
	
	/* Cria um novo no. */
    public No(Object objeto) {
    	this.object = objeto;
    	this.anterior = null;
    	this.proximo = null;
    	
    }
    //public No getAnterior() {
		//return anterior;
	//}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object objeto) {
		this.object = objeto;
	}
	//public No getProximo() {
		//return proximo;
	//}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	/* Testa se existe um No apos esse no. */
    public boolean hasNext() {
    	if (this.anterior != null) {
    		return true;
    	} 
    	else {
    		return false;
    	}
	}
    /* Testa se existe um No antes desse no. */
    public boolean hasPrevious() {
    	if (this.anterior != null) {
    		return true;
    	} 
    	else {
    		return false;
    	}
    
	}
    /* Retorna o próximo No. */
    public No next() {
		return proximo;
	
    
    }
    /* Retorna o No anterior. */
    public No previous() {
		return anterior;
	}
   


    /* Insere um No após esse no. */
    public void insertAfter(No novo) {
    	this.next().setAnterior(novo);
    	novo.setProximo(this.next());
    	this.setProximo(novo);
    	novo.setAnterior(this);
	}
   
    
    
    /* Insere um No antes desse no. */
    public void insertBefore(No novo) {
		this.previous().setProximo(novo);
		novo.setAnterior(this.previous());
		novo.setProximo(this);
		this.setAnterior(novo);
		
	}
   
    /* Recupera o dado armazenado. */
    public Object getData() {
		return object;
	}
    
    
    
    /* Remove o no */
    //public void remove() {
	//}
   
}
