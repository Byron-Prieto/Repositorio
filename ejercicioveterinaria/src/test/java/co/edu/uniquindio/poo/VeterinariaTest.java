package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class VeterinariaTest {

    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Inicio datosCompletos");

        var veterinaria = new Veterinaria("Veterinaria Amigos Peludos");

        assertEquals("Veterinaria Amigos Peludos", veterinaria.getNombre());

        LOG.info("Finalización datosCompletos");
    }

    @Test
    public void agregarMascota() {
        LOG.info("Inicio agregarMascota");

        var veterinaria = new Veterinaria("Veterinaria I");
        var mascota = new Mascota("1095124872", "Toby", "Canidae", "Labrador", 10, "Macho", "Amarillo", "29kg");

        veterinaria.registrarMascota(mascota);

        assertTrue(veterinaria.getListaMascotas().contains(mascota));
        assertEquals(1, veterinaria.getListaMascotas().size());

        LOG.info("Finalización agregarMascota");
    }
   
    @Test
    public void veterinariaNula() {
        LOG.info("Inicio veterinariaNula");

        assertThrows(Throwable.class, () -> new Veterinaria(null));

        LOG.info("Finalización veterinariaNula");
}

@Test
    public void agregarMascotaRepetida() {
        LOG.info("Inicio agregarMascotaRepetida");

        var veterinaria = new Veterinaria("Veterinaria Amigos Peludos");

        var mascota1 = new Mascota("1095124872", "Toby", "Canidae", "Labrador", 10, "Macho", "Amarillo", "29kg");
        
        var mascota2 = new Mascota("1095124872", "Valentin", "Canidae", "yorkshire", 14, "Macho", "Gris", "8kg");

        veterinaria.registrarMascota(mascota1);

        assertThrows(Throwable.class, () ->  veterinaria.registrarMascota(mascota2));

        LOG.info("Finalización agregarMascotaRepetida");
    }
}