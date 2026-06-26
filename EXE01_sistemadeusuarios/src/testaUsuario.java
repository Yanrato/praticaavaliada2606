
public class testaUsuario {

	
	public static void main(String[] args) {

		Usuario u1 = new Usuario("pedro","udud@gmail.com");
		Administrador a1 = new Administrador("gi", "audahdua@gmail.com", "segredo");
		
		u1.visualizar();
		a1.visualizar();
		
		//usuario sem nome
		try {
		    Usuario u2 = new Usuario("", "email@gmail.com");
		} catch (Exception erro) {
		    System.out.println(erro.getMessage());
		}
		//usuario sem @ no email
		try {
		    Usuario u3 = new Usuario("Celebi", "semarroba");
		} catch (Exception erro) {
		    System.out.println(erro.getMessage());
		}
		//usuario sem nome e sem email
		try {
		    Usuario u4 = new Usuario("", "");
		} catch (Exception erro) {
		    System.out.println(erro.getMessage());
		}
		//administrador sem nivel de acesso
		try {
		    Administrador a2 = new Administrador("Guilherme", "guilhermineo@gmail.com","");
		} catch (Exception erro) {
		    System.out.println(erro.getMessage());
		}
	
	
	}
	

}
