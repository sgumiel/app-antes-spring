package comentariosapp;

public class ComentariosService {

  private UsuariosService usuariosService;

  public ComentariosService(){
    this.usuariosService = new UsuariosService(new UsuarioBaneadoService());

  }

  public void comentar(String usuario, String comentario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu != null) {
      System.out.println("El usuario: "+usuario+" comenta lo siguiente: " + comentario);
    }

  }

}
