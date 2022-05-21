package edu.co.univalle.SistemaFarallones.Service.Impl;

import edu.co.univalle.SistemaFarallones.Model.Usuario;
import edu.co.univalle.SistemaFarallones.Repository.IUsuarioDao;
import edu.co.univalle.SistemaFarallones.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private IUsuarioDao iUsuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) iUsuarioDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuario usuario){
        iUsuarioDao.save(usuario);
    }
}
