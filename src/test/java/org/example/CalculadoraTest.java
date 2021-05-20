package org.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraTest {

    @InjectMocks
    Calculadora calc = new Calculadora(); //Dependiente

    @Mock
    CalculadoraOracleCloud calcOc; //Dependencia

    @Before
    public void init() {
        System.out.println("Soy el init. Inicializo Calculadora");

        //Comportamientos predecibles de la dependencia
        when(calcOc.sumar(5, 5)).thenReturn(10.0);
    }

    @Test
    public void probarSumar() {
        System.out.println("Probando suma");
        assertEquals(10.0, calc.sumar(5, 5), 0.001);
    }

    @Test
    public void probarRestar() {
        System.out.println("Probando resta");
        assertEquals(5.0, calc.restar(10, 5), 0.001);
    }

    @Test
    public void probarSumarEnOracleCloud(){
        assertEquals(10.0, calc.sumarEnOracleCloud(5, 5), 0.001);
    }

    @After
    public void close() {
        System.out.println("Terminando test");
    }
}
