package com.api.hateoas.repositorio;

import com.api.hateoas.modelo.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {
    @Query("UPDATE Cuenta c SET c.saldo=c.saldo + ?1 WHERE c.id=?")
    @Modifying
    void actualizarSaldo(float saldo, Integer id);
}
