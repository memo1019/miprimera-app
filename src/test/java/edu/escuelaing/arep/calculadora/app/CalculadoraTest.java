package edu.escuelaing.arep.calculadora.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import edu.escuelaing.AREP.Calculadora.CalculadoraMS.Calculadora;
import edu.escuelaing.AREP.Calculadora.Linkedist.Linkedist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    public void MediaTest1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));
        String lisString = null;
        Linkedist<Double> lista = new Linkedist<Double>();
        while ((lisString = bufferedReader.readLine()) != null) {
            lista.addNode(Double.parseDouble(lisString));
        }
        Double value = Calculadora.Media(lista);
        assertEquals(String.format(Locale.US, "%.2f", value), "550.60");
    }

    @Test
    public void MediaTest2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
        String lisString = null;
        Linkedist<Double> lista = new Linkedist<Double>();
        while ((lisString = bufferedReader.readLine()) != null) {
            lista.addNode(Double.parseDouble(lisString));
        }
        Double value = Calculadora.Media(lista);
        assertEquals(String.format(Locale.US, "%.2f", value), "60.32");
    }

    @Test
    public void DesviacionEstandarTest1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));
        String lisString = null;
        Linkedist<Double> lista = new Linkedist<Double>();
        while ((lisString = bufferedReader.readLine()) != null) {
            lista.addNode(Double.parseDouble(lisString));
        }
        Double value = Calculadora.Desviacion_estandar(lista);
        assertEquals(String.format(Locale.US, "%.2f", value), "572.03");
    }

    @Test
    public void DesviacionEstandarTest2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test2.txt"));
        String lisString = null;
        Linkedist<Double> lista = new Linkedist<Double>();
        while ((lisString = bufferedReader.readLine()) != null) {
            lista.addNode(Double.parseDouble(lisString));
        }
        Double value = Calculadora.Desviacion_estandar(lista);
        assertEquals(String.format(Locale.US, "%.2f", value), "62.26");
    }
}