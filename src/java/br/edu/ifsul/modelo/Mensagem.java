/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Renato
 */
public class Mensagem implements Serializable {

    @NotBlank(message = "A mensagem não pode ser em branca")
    @Length(max = 100, message = "A mensagem não pode ser maior do que {max} caracteres")
    private String mensagem;

    public Mensagem() {

    }

    public Mensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
