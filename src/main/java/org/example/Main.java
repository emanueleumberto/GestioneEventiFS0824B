package org.example;

import com.github.javafaker.Faker;
import org.example.dao.EventoDAO;
import org.example.dao.LocationDAO;
import org.example.dao.PartecipazioneDAO;
import org.example.dao.PersonaDAO;
import org.example.entities.*;
import org.example.enumeration.TipoEvento;
import org.example.enumeration.TipoGenere;
import org.example.enumeration.TipoSesso;
import org.example.enumeration.TipoStato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Main {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEventi");
    private static EntityManager em = emf.createEntityManager();

    public static void main( String[] args ) {
        EventoDAO eventoDao = new EventoDAO(em);
        LocationDAO locationDao = new LocationDAO(em);
        PersonaDAO personaDao = new PersonaDAO(em);
        PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO(em);

        Faker faker = new Faker(Locale.ITALY);

        //Location l1 = new Location(faker.name().name(), faker.address().city());
        //locationDao.save(l1);

        //Persona p1 = new Persona(faker.name().firstName(), faker.name().lastName(),faker.internet().emailAddress(),LocalDate.of(1980, 10, 25), TipoSesso.F);
        //personaDao.save(p1);

        // Non più funzionante
        //Evento e1 = new Evento("Finale Coppa", LocalDate.of(2025, 1, 25), "Super finale di coppa", TipoEvento.PUBBLICO, 100, locationDao.getByID(1));
        //eventoDao.save(e1);

        //Evento e1 = new Concerto("Vasco Rossi", LocalDate.of(2025, 1, 28), "Ultimo Concerto", TipoEvento.PUBBLICO, 100, locationDao.getByID(1), TipoGenere.ROCK, false);
        //eventoDao.save(e1);

        //Evento e2 = new PartitaDiCalcio("Finale Coppa", LocalDate.of(2025, 1, 25), "Super finale di coppa", TipoEvento.PUBBLICO, 100, locationDao.getByID(1), "Real Madrid", "Barcellona", "Real Madrid", 2, 1);
        //eventoDao.save(e2);

        //Set<Persona> listaAtleti = new HashSet<Persona>();
        //listaAtleti.add(personaDao.getByID(2));
        //Evento e3 = new GaraDiAtletica("Gara Nazionale", LocalDate.of(2025,3,10), "Campionato nazionale", TipoEvento.PRIVATO, 100, locationDao.getByID(1), listaAtleti, personaDao.getByID(2) );
        //eventoDao.save(e3);

        //Partecipazione p1 = new Partecipazione(personaDao.getByID(2), eventoDao.getByID(3), TipoStato.CONFERMATA);
        //partecipazioneDao.save(p1);

    }



}
