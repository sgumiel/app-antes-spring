package comentariosapp;

public class MostrarPerfilService {

  private UsuariosService usuariosService;

  public MostrarPerfilService(){
    this.usuariosService = new UsuariosService();

  }

  public void mostrarPerfil(String usuario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null) {
      System.out.println("El usuario: "+usu.nombre+" tiene el nickname: " + usu.nickname);
    }

  }

}
