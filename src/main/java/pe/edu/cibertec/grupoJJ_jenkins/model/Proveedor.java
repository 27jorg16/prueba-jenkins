package pe.edu.cibertec.grupoJJ_jenkins.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proveedorId;

    @Column(name = "NombreProveedor")
    private String nombreProveedor;

    @Column(name = "TelefonoProveedor")
    private String telefonoProveedor;

    @Column(name = "CorreoProveedor")
    private String correoProveedor;

    @Column(name = "DireccionProveedor")
    private String direccionProveedor;
}