package odk.apprenant.jobaventure_backend.repository;

import odk.apprenant.jobaventure_backend.model.Admin;
import odk.apprenant.jobaventure_backend.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
