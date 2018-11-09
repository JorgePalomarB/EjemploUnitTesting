
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOperacionesMatematicas {
    
    OperacionesMatematicas operacion = new OperacionesMatematicas();
    
    @Test
    public void dosMasDosIgualCuatro()
    {
      final int resultadoEsperado = 4;
      final int resultadoObtenido = operacion.suma(2, 2);
      Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void cuatroPorDosIgualOcho()
    {
        final int resultadoEsperado = 8;
        final int resultadoObtenido = operacion.multiplicacion(4, 2);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void quinceEntreTresIgualCinco()
    {
        final float resultadoEsperado = 5.0f;
        final float resultadoObtenido = operacion.division(15, 3);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
}
