
public class Estrofe1 implements Estrofe {

	@Override
	public String estrofe() {
		
		String estrofe = "";
		
		VersoJoao versoJoao = new VersoJoao();
		estrofe += versoJoao.verso() +"\n";
		
		VersoMaria versoMaria = new VersoMaria();
		estrofe += versoMaria.verso() +"\n";

		return estrofe;
	}



	
	
}
