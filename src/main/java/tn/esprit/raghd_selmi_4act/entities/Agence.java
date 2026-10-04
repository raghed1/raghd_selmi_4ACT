package tn.esprit.raghd_selmi_4act.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"employes", "vehicules"})
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    // Cote inverse : une Agence a plusieurs Employe
    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private List<Employe> employes = new ArrayList<>();

    // Cote inverse : une Agence gere plusieurs Vehicule
    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private List<Vehicule> vehicules = new ArrayList<>();
}
