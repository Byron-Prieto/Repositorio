package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class MascotaTest{

  private static final Logger LOG = Logger.getLogger (MascotaTest.class.getName());

  @Test
  public void datosCompletos(){

    LOG.info("inicio de la prueba datos completos");
  
      Mascota mascota = new Mascota("Toby", "Canidae", "Labrador", 10, "Macho", "Amarillo", "29kg");
  
        assertEquals("Toby", mascota.nombre());
        assertEquals("Canidae", mascota.especie());
        assertEquals("Labrador", mascota.raza());
        assertEquals(10, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Amarillo", mascota.color());
        assertEquals("29kg", mascota.peso());
  }
  
  @Test
  public void datosNulos(){

    LOG.info("inicio de la prueba datos Nulos");
  
      Mascota mascota = new Mascota(null, null, null, 0, null, null, null);
  
        assertEquals("Toby", mascota.nombre());
        assertEquals("Canidae", mascota.especie());
        assertEquals("Labrador", mascota.raza());
        assertEquals(10, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Amarillo", mascota.color());
        assertEquals("29kg", mascota.peso());
  }

  @Test
  public void datosVacios(){

    LOG.info("inicio de la prueba datos Vacios");
  
      Mascota mascota = new Mascota("", "", "", 0, "Macho", null, "29kg");
  
        assertEquals("Toby", mascota.nombre());
        assertEquals("Canidae", mascota.especie());
        assertEquals("Labrador", mascota.raza());
        assertEquals(10, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Amarillo", mascota.color());
        assertEquals("29kg", mascota.peso());
  }

  @Test
  public void edadNegativa(){

    LOG.info("inicio de la prueba edad negativa");
  
      Mascota mascota = new Mascota("Toby", "Canidae", "Labrador", -10, "Macho", "Amarillo", "29kg");
  
        assertEquals("Toby", mascota.nombre());
        assertEquals("Canidae", mascota.especie());
        assertEquals("Labrador", mascota.raza());
        assertEquals(10, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Amarillo", mascota.color());
        assertEquals("29kg", mascota.peso());
  }

  @Test
  public void razaInvalida(){

    LOG.info("inicio de la prueba raza invalida");
  
      Mascota mascota = new Mascota("Toby", "Canidae", "65214", 10, "Macho", "Amarillo", "29kg");
  
        assertEquals("Toby", mascota.nombre());
        assertEquals("Canidae", mascota.especie());
        assertEquals("Labrador", mascota.raza());
        assertEquals(10, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Amarillo", mascota.color());
        assertEquals("29kg", mascota.peso());
  }
}

 