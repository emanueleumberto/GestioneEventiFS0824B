package org.example.entities;

import org.example.enumeration.TipoEvento;
import org.example.enumeration.TipoGenere;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "concerti")
public class Concerto extends Evento {

    @Enumerated(EnumType.STRING)
    private TipoGenere genere;
    private boolean inStriming;

    public Concerto() { }

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, TipoGenere genere, boolean inStriming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.genere = genere;
        this.inStriming = inStriming;
    }

    public boolean isInStriming() {
        return inStriming;
    }

    public void setInStriming(boolean inStriming) {
        this.inStriming = inStriming;
    }

    public TipoGenere getGenere() {
        return genere;
    }

    public void setGenere(TipoGenere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStriming=" + inStriming +
                '}';
    }
}
