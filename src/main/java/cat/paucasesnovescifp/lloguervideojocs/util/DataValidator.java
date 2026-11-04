/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.util;

import java.util.regex.Pattern;

/**
 *
 * @author marc
 */
public class DataValidator {
    private static final Pattern DNI_PATTERN = Pattern.compile("^[0-9]{8}[A-Za-z]$");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^[6789]\\d{8}$");
    
    public static boolean isDniValid(String dni){
        return DNI_PATTERN.matcher(dni).matches();
    }
    
    public static boolean isPhoneNumberValid(String phoneNumber){
        return PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches();
    }
}
