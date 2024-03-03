package co.edu.uniquindio.poo;

public record Mascota(String numeroIdentificacion, String nombre, String especie, String raza, int edad, String genero, String color, String peso){

    public Mascota {
        assert numeroIdentificacion != null & !numeroIdentificacion.isBlank()   : "El número de identificación debe ser diferente de null y diferente de vacio";
        assert nombre != null & !nombre.isBlank() : "El nombre debe ser diferente de null y diferente de vacio";
        assert especie != null & !especie.isBlank() : "El apellido debe ser diferente de null y diferente de vacio";
        assert raza != null & !raza.isBlank() : "La raza no puede ser null ni vacia";
        assert edad > 0 : "La edad debe ser mayor a cero";
        assert genero != null & !genero.isBlank(): "El genero no puede ser null ni vacio";
        assert color != null & !color.isBlank(): "El color no puede ser null ni vacio";
        assert peso != null & !peso.isBlank(): "el peso no puede ser null ni vacio";
        }
    
}



