package comentariosapp;

public class ComprarDineroService {

  private UsuariosService usuariosService;
  private UsuarioBaneadoService usuarioBaneadoService;

  public ComprarDineroService(){
      this.usuarioBaneadoService = new UsuarioBaneadoService();
    this.usuariosService = new UsuariosService(this.usuarioBaneadoService);
    this.usuarioBaneadoService = new UsuarioBaneadoService();

  }

  public void comprarDinero(String usuario, Integer cantidad) {

    Boolean isUsuarioBaneado = this.usuarioBaneadoService.isBaneado(usuario);

    if(isUsuarioBaneado) {
      System.out.println("El usuario: " + usuario + " no puede comprar porque está baneado");
      return;
    }

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu != null ){
        System.out.println("El usuario: "+usuario+" compra la siguiente cantidad: " + cantidad);
    }
  }
}
