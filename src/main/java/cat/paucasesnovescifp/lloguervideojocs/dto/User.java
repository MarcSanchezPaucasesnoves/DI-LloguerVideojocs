/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.dto;

import cat.paucasesnovescifp.lloguervideojocs.util.DataValidator;
import java.time.LocalDate;

/**
 *
 * @author alumne
 */
public class User {
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String dni;
    private String phoneNumber;
    private final LocalDate registerDate;

    public User(String name, String firstSurname, String secondSurname, String dni, String phoneNumber) throws DtoException{
        setName(name);
        setFirstSurname(firstSurname);
        setSecondSurname(secondSurname);
        setDni(dni);
        setPhoneNumber(phoneNumber);
        registerDate = LocalDate.now();
    }

    public String getNom() {
        return name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public String getDni() {
        return dni;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    private void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    private void setDni(String dni) throws DtoException{
        if (DataValidator.isDniValid(dni)) this.dni = dni;
        else throw new DtoException("El dni no és vàlid. Ha de tenir vuit nombres i una lletra. No pot tenir espais en blanc.");
    }

    private void setPhoneNumber(String phoneNumber) throws DtoException{
        if (DataValidator.isPhoneNumberValid(phoneNumber)) this.phoneNumber = phoneNumber;
        else throw new DtoException("El nombre de telèfon no és vàlid. Ha de tenir nou nombres i no hi poden haver espais en blanc.");
    }
    
    public String getNameFirstSurname() {
        return name + " " + firstSurname;
    }

}
