package com.conection.sqlorm.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_cliente;
    int dni_cliente;
    String nombre_cliente;
    String apellido_cliente;
    String correo_cliente;
    String direccion_cliente;
    String telefono_cliente;
}
