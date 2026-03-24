package com.api.hateoas;

import com.api.hateoas.modelo.Cuenta;
import com.api.hateoas.repositorio.CuentaRepositorio;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
// Rollback es una anotacion de Spring para el testing: "Cuando termine el test, dezhaste de los los camnbios en la BD
@Rollback(value = true)
public class CuentaRepositorioTest {

    @Autowired
    private CuentaRepositorio cuentaRepositorio;
    @Test
    void testAgregarCuenta() {
        Cuenta cuenta = new Cuenta(123, "1234567");
        Cuenta cuentaGuardada = cuentaRepositorio.save(cuenta);

        Assertions.assertThat(cuentaGuardada).isNotNull(); // Comprobar que la cuenta no sea nula
        Assertions.assertThat(cuentaGuardada.getId()).isGreaterThan(0); // Comprobar que el ID de la cuenta guardada sea mayor que 0

    }
}
