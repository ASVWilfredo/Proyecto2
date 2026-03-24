package com.api.hateoas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "cuentas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta extends RepresentationModel<Cuenta> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false, unique = true)
    private String numCuenta;

    private float saldo;

    public Cuenta(Integer id, String numCuenta) {
        this.id = id;
        this.numCuenta = numCuenta;
    }
}
