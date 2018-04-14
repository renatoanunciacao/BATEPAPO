package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Calendar;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Mensagem implements Serializable {

    //@NotBlank(message = "A mensagem não pode ser em branca")
    //@Length(max = 100, message = "A mensagem não pode ser maior do que {max} caracteres")
    private String mensagem;

    private Usuarios usuario;

    private Calendar horaMensagem;

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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Calendar getHoraMensagem() {
        return horaMensagem;
    }

    public void setHoraMensagem(Calendar horaMensagem) {
        this.horaMensagem = horaMensagem;
    }

}
