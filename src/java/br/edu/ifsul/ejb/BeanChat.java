/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.ejb;

import br.edu.ifsul.modelo.Mensagem;
import br.edu.ifsul.modelo.Usuarios;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Singleton;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Renato
 */
@Singleton
public class BeanChat implements Serializable {

    private List<Mensagem> mensagens = new ArrayList<>();
    private List<Usuarios> usuarios = new ArrayList<>();

    public BeanChat() {

    }

    public void adicionaUsuario(Usuarios obj) {

        if (usuarios.contains(obj)) {
            FacesMessage msg = new FacesMessage("Usuário já existe com esse nome no chat!");
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } else {
            usuarios.add(obj);
            System.out.println("nome: " + obj.getNome());
            FacesMessage msg = new FacesMessage("Usuário adicionado ao chat!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

//        for (Usuarios u : usuarios) {
//            if (!u.getNome().equals(obj.getNome())) {
//                usuarios.add(obj);
//                FacesMessage msg = new FacesMessage("Usuário adicionado ao chat!");
//                FacesContext.getCurrentInstance().addMessage(null, msg);
//            } else {
//                FacesMessage msg = new FacesMessage("Usuário já existe com esse nome no chat!");
//                FacesContext.getCurrentInstance().addMessage(null, msg);
//            }
//        }
    }

    public void removerUsuario(Usuarios obj) {
        usuarios.remove(obj);
        FacesMessage msg = new FacesMessage("Usuário removido do chat!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void adicionarMensagem(Usuarios usu, Mensagem obj) {
        mensagens.add(obj);

    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

}
