package org.example.entities;

import org.example.enumeration.TipoSesso;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "persone")
public class Persona {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cognome;
    @Column(unique = true)
    private String email;
    private LocalDate dataDiNascita;
    @Enumerated(EnumType.STRING)
    private TipoSesso sesso;
    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> listaPartecipazioni;

    @ManyToMany(mappedBy = "atleti")
    private Set<GaraDiAtletica> gareDiAtletica;

    public Persona() { }

    public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, TipoSesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
        this.listaPartecipazioni = new ArrayList<Partecipazione>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public TipoSesso getSesso() {
        return sesso;
    }

    public void setSesso(TipoSesso sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", sesso=" + sesso +
                ", listaPartecipazioni=" + listaPartecipazioni +
                '}';
    }
}
