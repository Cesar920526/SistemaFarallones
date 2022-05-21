package edu.co.univalle.SistemaFarallones.Repository;

import edu.co.univalle.SistemaFarallones.Model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
}
