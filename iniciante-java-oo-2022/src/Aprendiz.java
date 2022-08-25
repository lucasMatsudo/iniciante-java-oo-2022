
public class Aprendiz {

	private String compartilharExperiencia;
	private String gerarDuvidas;
	private Codar Codar;

	    public Aprendiz (String compartilharExperiencia, String gerarDuvidas) {
	        this.compartilharExperiencia = compartilharExperiencia;
	        this.gerarDuvidas = gerarDuvidas;
	    }
	    
	    public Codar getCodar() {
	        return Codar;
	    }
	    public void setCodar(Codar Codar) {
	        this.Codar = Codar;
	    }

	    
	    public String getCompartilharExperiencia() {
	        return compartilharExperiencia;
	    }
	    
	    public void setCompartilharExperiencia(String compartilharExperiencia) {
	        this.compartilharExperiencia = compartilharExperiencia;
	    }
	    
	    
	    public String getGerarDuvidas() {
	        return gerarDuvidas;
	    }

	    public void setGerarDuvidas(String gerarDuvidas) {
	        this.gerarDuvidas = gerarDuvidas;
	    }
	    
	    

	    
}