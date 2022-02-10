package comentariosapp;

public class LegacyAntesSpringApplication {

  static ComentariosService comentariosService = new ComentariosService();
  static ComprarDineroService comprarDineroService = new ComprarDineroService();
  static MostrarPerfilService mostrarPerfilService = new MostrarPerfilService();

  public static void main(String[] args) {

    switch(args[0]) {

      case "comentario" -> ejecutarComentario(args[1],args[2]);
      case "comprar" -> ejecutarcomprarDinero(args[1], Integer.valueOf(args[2]));
      case "perfil" -> ejecutarMostrarPerfil(args[1]);
      default -> System.out.println("Comando no reconocido");
    }



  }

  private static void ejecutarComentario(String usuario, String comentario){
    comentariosService.comentar(usuario,comentario);
  }

  private static void ejecutarcomprarDinero(String usuario, Integer cantidad){
    comprarDineroService.comprarDinero(usuario,cantidad);

  }

  private static void ejecutarMostrarPerfil(String usuario){
    mostrarPerfilService.mostrarPerfil(usuario);
  }

}
