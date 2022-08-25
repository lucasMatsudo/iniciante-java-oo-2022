
public class Mentor {
	
	private String criarEvento;
    private String resolverDuvidas;
    private String auxiliarAprendizes;
    private Codar Codar;

    public Mentor(String criarEvento, String resolverDuvidas, String auxiliarAprendizes) {
    	this.criarEvento = criarEvento;
    	this.auxiliarAprendizes = auxiliarAprendizes;
        this.resolverDuvidas = resolverDuvidas;
    }

    public Codar getCodar() {
        return Codar;
    }	
    public void setCodar(Codar Codar) {
        this.Codar = Codar;
    }

    
    public String getCriarEvento() {
        return criarEvento;
    }

    public void setCriarEvento(String criarEvento) {
        this.criarEvento = criarEvento;
    }

    public String getResolverDuvidas() {
        return resolverDuvidas;
    }

    public void setResolverDuvidas(String resolverDuvidas) {
        this.resolverDuvidas = resolverDuvidas;
    }

    public String getAuxiliarAprendizes() {
    	return auxiliarAprendizes;
    }
    
	public void setAuxiliarAprendizes(String auxiliarAprendizes) {
		this.auxiliarAprendizes = auxiliarAprendizes;
	}
	    
}
