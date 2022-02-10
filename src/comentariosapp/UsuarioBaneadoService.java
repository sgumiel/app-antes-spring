package comentariosapp;

import java.util.List;

public class UsuarioBaneadoService {

  private List<String> usuarioBaneados = List.of("Juan");

  public Boolean isBaneado(String usuario) {

    return usuarioBaneados.contains(usuario);
  }

}
