package com.api.hateoas.controlador;

import com.api.hateoas.modelo.Cuenta;
import com.api.hateoas.repositorio.CuentaRepositorio;
import com.api.hateoas.servicio.CuentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaControlador {

    @Autowired
    private CuentaServicio cuentaServicio;

    @GetMapping
    public ResponseEntity<List<Cuenta>> listarCuentas() {
        List<Cuenta> cuentas = cuentaServicio.listAll();
        if(cuentas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(cuentas, HttpStatus.OK);
    }
}
