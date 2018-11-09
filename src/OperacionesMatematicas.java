/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JORGE
 */
public class OperacionesMatematicas {
    
    public int suma(int num1, int num2)
    {
        return num1 + num2;
    }
    
    public int multiplicacion(int multiplicando,int multiplicador)
    {
        return multiplicando * multiplicador;
    }
    
    public float division(float dividendo, float divisor)
    {
        if(divisor == 0)
            throw new IllegalArgumentException("¡No se puede dividir por 0!");
            
        return dividendo / divisor;
    }
    
}
