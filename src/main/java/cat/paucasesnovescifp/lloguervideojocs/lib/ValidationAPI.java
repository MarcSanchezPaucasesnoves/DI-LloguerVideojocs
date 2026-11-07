/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.lib;

import cat.paucasesnovescifp.lloguervideojocs.dto.DtoException;
import java.util.regex.Pattern;

/**
 *
 * @author marc
 */
public class ValidationAPI {
    private static final Pattern DNI_PATTERN = Pattern.compile("^[0-9]{8}[A-Za-z]$");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^\\d{9}$");
    private static final Pattern STARTS_WITH_CAPITAL_PATTERN = Pattern.compile("^[A-ZÁÉÍÓÚÑ].*");
    
    public static void isDniValid(String dni) throws DtoException{
        if (!DNI_PATTERN.matcher(dni).matches()) throw new DtoException("El dni no és vàlid. Ha de tenir vuit nombres i una lletra i no pot tenir espais en blanc.");
    }
    
    public static void isPhoneNumberValid(String phoneNumber) throws DtoException{
        if (!PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches()) throw new DtoException("El nombre de telèfon no és vàlid. Ha de tenir nou nombres i no hi poden haver espais en blanc.");
    }
    
    public static void startsWithCapital(String text) throws DtoException{
        if (!STARTS_WITH_CAPITAL_PATTERN.matcher(text).matches()) throw new DtoException("Tots els camps han de començar amb majúscula.");
    }
}
