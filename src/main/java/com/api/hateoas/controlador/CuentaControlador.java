package com.api.hateoas.controlador;

import com.api.hateoas.modelo.Cuenta;
import com.api.hateoas.repositorio.CuentaRepositorio;
import com.api.hateoas.servicio.CuentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<Cuenta> listarCuenta(@PathVariable Integer id) {
        try {
            Cuenta cuenta = cuentaServicio.get(id);
            return new ResponseEntity<>(cuenta, HttpStatus.OK);
        } catch (Exception exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Cuenta> guardarCuenta(@RequestBody Cuenta cuenta) {
        Cuenta cuentaBD = cuentaServicio.save(cuenta);
        return new ResponseEntity<>(cuenta, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Cuenta> editarCuenta(@RequestBody Cuenta cuenta) {
        Cuenta cuentaBD = cuentaServicio.save(cuenta);
        return new ResponseEntity<>(cuentaBD, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarCuenta(@PathVariable Integer id) {
        try {
            cuentaServicio.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception exception) {
            return ResponseEntity.notFound().build();
        }
    }
}
