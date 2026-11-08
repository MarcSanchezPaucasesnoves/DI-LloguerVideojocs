/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author marc
 */
public class StringFormater {
    private static DateTimeFormatter customDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public static String dateToString(LocalDate date) {
        return date.format(customDateFormatter);
    }
}
