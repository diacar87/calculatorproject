/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logicaNegocio;

/**
 *
 * @author Administrador
 */
public class DoubleOperations implements Operations{
    
    public Object div(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) / Double.parseDouble(String.valueOf(arg2));
    }

    public Object mult(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) * Double.parseDouble(String.valueOf(arg2));
    }

    public Object substraction(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) - Double.parseDouble(String.valueOf(arg2));
    }

    public Object sum(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) + Double.parseDouble(String.valueOf(arg2));
    }
}
