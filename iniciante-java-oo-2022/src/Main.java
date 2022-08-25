public class Main {
	
	public static void main(String[] args) {
	
		Codar ColaboradorLucas = new Codar("Lucas Matsudo", "Conheci o Movimento através de um Amigo", "Eu sou um Aprendiz no Movimento Codar");
        Codar ColaboradorVinicius = new Codar("Vinicius Ueda", "Conheci o Movimento por motivo x", "Eu sou um Mentor no Movimento Codar");
        Codar ColaboradoraJessica = new Codar("Jessica", "Conheci por motivo y", "Eu sou uma Organizadora no Movimento Codar");

        Aprendiz Lucas = new Aprendiz("- Gosto muito de aprender sobre Java e outras linguagens de programação e estou aberto para conversar sobre.", "- Tenho algumas dúvidas técnicas sobre Java e Abstração");
        Mentor Vinicius = new Mentor("- Crio eventos no Movimento", "- Crio desafios e ajudo aprendizes no processo", "- Auxilio aprendizes no caminho do aprendizado.");
        Organizador Jessica = new Organizador("- Ajudo mentores e aprendizes no decorrer do Movimento", "- Crio eventos para aprendizes e mentores");


        System.out.println("---------------Aprendiz------------");
        Lucas.setCodar(ColaboradorLucas);
        System.out.println("Me chamo " + Lucas.getCodar().getNome() );
        System.out.println(Lucas.getCodar().getFuncoesNoMovimento() );   
        System.out.println(Lucas.getCompartilharExperiencia() );
        System.out.println(Lucas.getGerarDuvidas() + "\n" + "\n" );
        

        System.out.println("---------------Mentor(a)------------");
        Vinicius.setCodar(ColaboradorVinicius);
        System.out.println("Me chamo " + Vinicius.getCodar().getNome() );   
        System.out.println(Vinicius.getCodar().getFuncoesNoMovimento() ); 
        System.out.println(Vinicius.getCriarEvento() );  
        System.out.println(Vinicius.getResolverDuvidas() ); 
        System.out.println(Vinicius.getAuxiliarAprendizes() + "\n" + "\n" ); 
        
        
        System.out.println("-------------Organizador(a)------------");
        Jessica.setCodar(ColaboradoraJessica);
        System.out.println("Me chamo " + Jessica.getCodar().getNome() ); 
        System.out.println(Jessica.getCodar().getFuncoesNoMovimento() );  
        System.out.println(Jessica.getResolverDuvidas() );  
        System.out.println(Jessica.getAuxiliarMentores() + "\n" + "\n" ); 
        
        
	}
}
