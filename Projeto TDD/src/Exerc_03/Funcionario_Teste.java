package Exerc_03;

import org.junit.Test;
import static org.junit.Assert.*;

public class Funcionario_Teste {

    @Test
    public void testCalculoSalarioDesenvolvedor() {
        Funcionario desenvolvedor = new Funcionario("Tobias", "tobias.sousa@fatec.com", 4000.00, Cargo.DESENVOLVEDOR);
        assertEquals(3200.00, desenvolvedor.calcularSalarioLiquido(), 0.001);
    }


}
