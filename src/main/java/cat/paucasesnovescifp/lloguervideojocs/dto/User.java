/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.dto;

import cat.paucasesnovescifp.lloguervideojocs.lib.ValidationAPI;
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

    private void setName(String name) throws DtoException{
        ValidationAPI.startsWithCapital(name);
        this.name = name;
    }

    private void setFirstSurname(String firstSurname) throws DtoException{
        ValidationAPI.startsWithCapital(firstSurname);
        this.firstSurname = firstSurname;
    }

    private void setSecondSurname(String secondSurname) throws DtoException{
        ValidationAPI.startsWithCapital(secondSurname);
        this.secondSurname = secondSurname;
    }

    private void setDni(String dni) throws DtoException{
        ValidationAPI.isDniValid(dni);
        this.dni = dni;
    }

    private void setPhoneNumber(String phoneNumber) throws DtoException{
        ValidationAPI.isPhoneNumberValid(phoneNumber);
        this.phoneNumber = phoneNumber;
    }
    
    public String getNameFirstSurname() {
        return name + " " + firstSurname;
    }

}
