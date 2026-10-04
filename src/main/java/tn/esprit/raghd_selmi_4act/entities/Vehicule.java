package tn.esprit.raghd_selmi_4act.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"agence", "maintenances", "equipements", "reservations"})
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    @Column(name = "categorie")
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private StatutVehicule statut;

    // Cote proprietaire : plusieurs Vehicule appartiennent a une Agence
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agence")
    private Agence agence;

    // Cote inverse : un Vehicule a plusieurs Maintenance
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Maintenance> maintenances = new ArrayList<>();

    // Cote inverse : un Vehicule a plusieurs Equipement
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    private List<Equipement> equipements = new ArrayList<>();

    // Cote inverse : un Vehicule a plusieurs Reservation
    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations = new ArrayList<>();
}
