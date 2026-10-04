package tn.esprit.raghd_selmi_4act.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"vehicule", "client", "contrat"})
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private StatutReservation statut;

    // Cote proprietaire : plusieurs Reservation portent sur un Vehicule
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_vehicule")
    private Vehicule vehicule;

    // Cote proprietaire : plusieurs Reservation appartiennent a un Client
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Client client;

    // Cote inverse : une Reservation donne lieu a un seul Contrat
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL)
    private Contrat contrat;
}
