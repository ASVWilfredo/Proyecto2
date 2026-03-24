package com.api.hateoas.servicio;

import com.api.hateoas.modelo.Cuenta;
import com.api.hateoas.repositorio.CuentaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CuentaServicio {

    @Autowired
    private CuentaRepositorio cuentaRepositorio;

    public List<Cuenta> listAll() {
        return cuentaRepositorio.findAll();
    }

    public Cuenta get(Integer id) {
        return cuentaRepositorio.findById(id).get();
    }

    public Cuenta save(Cuenta cuenta) {
        return cuentaRepositorio.save(cuenta);
    }

    public void delete(Integer id) {
        cuentaRepositorio.deleteById(id);
    }


}
