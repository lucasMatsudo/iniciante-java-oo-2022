
public class Codar {
	
	private String nome;
    private String conheceuMovimento;
    private String funcoesNoMovimento;

    public Codar(String nome, String conheceuMovimento, String funcoesNoMovimento) {
        this.nome = nome;
        this.conheceuMovimento = conheceuMovimento;
        this.funcoesNoMovimento = funcoesNoMovimento;
    }


    public String getFuncoesNoMovimento() {
        return funcoesNoMovimento;
    }

    public void setFuncoesNoMovimento(String funcoesNoMovimento) {
        this.funcoesNoMovimento = funcoesNoMovimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConheceuMovimento() {
        return conheceuMovimento;
    }

    public void setConheceuMovimento(String conheceuMovimento) {
        this.conheceuMovimento = conheceuMovimento;
    }


}