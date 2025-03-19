import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MetodosTest {

    @ParameterizedTest
    @CsvSource({
        "00000000, T",
        "11111111, R",
        "22222222, W",
        "33333333, A",
        "44444444, G",
        "55555555,L",
        "66666666,E",
        "77777777,P",
        "88888888,D",
        "99999999,X",
        "12345678, Z",
        "87654321, S",

    })




    @DisplayName("Prueba para comprobar el DNI")
    void comprobarDNI(String dni, char letra) {
        assertTrue(Main.comprobarDNI(dni, letra));
        assertFalse(Main.comprobarDNI(dni, letra));

    }

    @ParameterizedTest
    @CsvSource({

            "00000000, T",
            "11111111, R",
            "22222222, W",
            "33333333, A",
            "44444444, G",
            "55555555,L",
            "66666666,E",
            "77777777,P",
            "88888888,D",
            "99999999,X",
            "12345678, Z",
            "87654321, S",
    })
    @DisplayName("Prueba para calcular la letra del DNI")
    public void calcularLetraDNI(String dni, char letraEsperada) {
        assertEquals(letraEsperada, Main.calcularLetraDNI(dni));

    }

}
