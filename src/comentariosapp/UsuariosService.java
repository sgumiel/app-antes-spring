package comentariosapp;

import java.util.Map;

public class UsuariosService {

  private final Map<String, Usuario> usuarios = Map.ofEntries(
      Map.entry("Juan", new Usuario("Juan", "juan89")),
      Map.entry("Soledad", new Usuario("Soledad", "sole2000")),
      Map.entry("Lorena", new Usuario("Lorena", "lalore")));

  private final UsuarioBaneadoService usuarioBaneadoService;

  public UsuariosService(UsuarioBaneadoService usuarioBaneadoService) {
    this.usuarioBaneadoService = usuarioBaneadoService;

  }

  public Usuario findUsuario(String nombre) {

    if (!usuarioBaneadoService.isBaneado(nombre)) {
      return usuarios.get(nombre);
    } else {
      return null;
    }

  }

}
