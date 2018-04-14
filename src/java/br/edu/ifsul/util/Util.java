/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.util;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Renato
 */
@FacesConverter(value = "conveterCalendar")
public class Util implements Serializable, Converter{
SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try{
           sdf.setLenient(true);
           Calendar retorno = Calendar.getInstance();
           retorno.setTime(sdf.parse(string));
           return retorno;
            
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if (o == null) {
            return null;
        }
        Calendar obj = (Calendar) o;
        return sdf.format(obj.getTime());
    }
    
}
