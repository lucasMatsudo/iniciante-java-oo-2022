public class Organizador {
	
	private String resolverDuvidas;
	private String auxiliarMentores;
	private Codar Codar;

	    public Organizador(String auxiliarMentores, String resolverDuvidas) {
	        this.resolverDuvidas = resolverDuvidas;
	        this.auxiliarMentores = auxiliarMentores;
	    }

	    public Codar getCodar() {
	        return Codar;
	    }
	    public void setCodar(Codar Codar) {
	        this.Codar = Codar;
	    }

	    
	    public String getResolverDuvidas() {
	        return resolverDuvidas;
	    }

	    public void setResolverDuvidas(String resolverDuvidas) {
	        this.resolverDuvidas = resolverDuvidas;
	    }

	    public String getAuxiliarMentores() {
	        return auxiliarMentores;
	    }

	    public void setAuxiliarMentores(String auxiliarMentores) {
	        this.auxiliarMentores = auxiliarMentores;
	    }

}
