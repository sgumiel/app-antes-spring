package comentariosapp;

public class ComprarDineroService {

  private UsuariosService usuariosService;

  public ComprarDineroService(){
    this.usuariosService = new UsuariosService();

  }

  public void comprarDinero(String usuario, Integer cantidad) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null ){
      System.out.println("El usuario: "+usuario+" compra la siguiente cantidad: " + cantidad);
    }

  }
}
