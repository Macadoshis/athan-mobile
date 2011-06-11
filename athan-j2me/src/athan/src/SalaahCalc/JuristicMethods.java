/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package athan.src.SalaahCalc;

/**
 * @author BENBOUZID
 */
public class JuristicMethods {

    public final int value;

    protected static final int Shafii_VAL = 0;
    protected static final int Hanafi_VAL = 1;

    /** L'attribut qui contient la valeur associ� � l'enum */
    public static final JuristicMethods Shafii = new JuristicMethods(Shafii_VAL);
    public static final JuristicMethods Hanafi = new JuristicMethods(Hanafi_VAL);

    /** Le constructeur qui associe une valeur � l'enum */
    private JuristicMethods(int value) {
        this.value = value;
    }

    /** La m�thode accesseur qui renvoit la valeur de l'enum */
    public int getValue() {
        return this.value;
    }
}
