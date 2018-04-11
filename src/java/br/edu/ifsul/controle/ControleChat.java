/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.controle;

import br.edu.ifsul.ejb.BeanChat;
import br.edu.ifsul.modelo.Mensagem;
import br.edu.ifsul.modelo.Usuarios;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Renato
 */
@Named(value = "controleChat")
@SessionScoped
public class ControleChat implements Serializable {

    @EJB
    private BeanChat beanChat;

    private String nome;

    private String mensagem;

    public ControleChat() {

    }

    public String adiciona() {
        Usuarios u = new Usuarios(nome);
        beanChat.adicionaUsuario(u);
        return "chat";
    }

    public String enviaMensagem(Usuarios u) {
        Mensagem m = new Mensagem(mensagem);
        beanChat.adicionarMensagem(u, m);
        return "chat";
    }

    public String verChat() {
        return "chat";
    }

    public BeanChat getBeanChat() {
        return beanChat;
    }

    public void setBeanChat(BeanChat beanChat) {
        this.beanChat = beanChat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
