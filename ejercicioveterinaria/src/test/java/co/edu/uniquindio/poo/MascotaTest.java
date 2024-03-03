package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class MascotaTest{

  private static final Logger LOG = Logger.getLogger (MascotaTest.class.getName());

  @Test
  public void datosCompletos(){

    LOG.info("inicio de la prueba datos completos");
  
      Mascota mascota = new Mascota("1095124872", "Toby", "Canidae", "Labrador", 10, "Macho", "Amarillo", "29kg");

        assertEquals("Toby", mascota.nombre());
        assertEquals("Canidae", mascota.especie());
        assertEquals("Labrador", mascota.raza());
        assertEquals(10, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Amarillo", mascota.color());
        assertEquals("29kg", mascota.peso());
        assertEquals("1095124872", mascota.numeroIdentificacion());
        LOG.info("Finalizacion de la prueba datos completos");
  }

  
}  
 
 