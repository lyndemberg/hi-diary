
package com.ifpb.HiDiary.Modelo;
import Excecoes.AgendaInvalidaException;

import com.ifpb.HiDiary.Visao.PaginaInicial;
import static com.ifpb.HiDiary.Visao.PaginaInicial.usuarioLogado;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

    /**
     * Essa classe representa cada Agenda, tendo seu nome e sua lista de compromissos. Nela é possível
     * fazer todo o CRUD de compromissos usando lista
     * @author Lyndemberg
     * @version 1.0
     */
public class Agenda implements Serializable{
    private String emailUsuario;
    private String nome;

    public Agenda(String emailUsuario, String nome) {
        if(nome.equals("")) throw new AgendaInvalidaException("O Nome da agenda não pode ser vazio");
        this.emailUsuario = emailUsuario;
        this.nome = nome;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals("")) throw new AgendaInvalidaException("O Nome da agenda não pode ser vazio");
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.emailUsuario);
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        if (!Objects.equals(this.emailUsuario, other.emailUsuario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
   
}
