/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import cat.paucasesnovescifp.lloguervideojocs.dto.DtoException;
import cat.paucasesnovescifp.lloguervideojocs.lib.ValidationAPI;
import org.netbeans.validation.api.Problems;

/**
 *
 * @author marc
 */
public class MayusValidator extends StringValidator{

    @Override
    public void validate(Problems problems, String fieldName, String text) {
        try {
            ValidationAPI.startsWithCapital(text);
        } catch (DtoException e) {
            problems.add(fieldName + ": Ha de començar amb majúscula.");
        }
    }
    
}
