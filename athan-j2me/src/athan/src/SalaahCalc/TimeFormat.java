/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package athan.src.SalaahCalc;

/**
 * @author BENBOUZID
 */
public class TimeFormat {

    private final int value;

    protected static final int Time24 = 0;      // 24-hour format
    protected static final int Time12 = 1;      // 12-hour format
    protected static final int Time12NS = 2;    // 12-hour format with no suffix

    /** L'attribut qui contient la valeur associ� � l'enum */
    public static final TimeFormat H24 = new TimeFormat(Time24);
    public static final TimeFormat H12 = new TimeFormat(Time12);
    public static final TimeFormat H12NS = new TimeFormat(Time12NS);

    /** Le constructeur qui associe une valeur � l'enum */
    private TimeFormat(int value) {
        this.value = value;
    }

    /** La m�thode accesseur qui renvoit la valeur de l'enum */
    public int getValue() {
        return this.value;
    }
}