package edu.co.univalle.SistemaFarallones.Service;


import edu.co.univalle.SistemaFarallones.Model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listaUsuarios();

    public void guardar(Usuario usuario);

}
