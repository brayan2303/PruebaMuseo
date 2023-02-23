package example.repository;

import example.model.ObraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ObraRepository extends JpaRepository<ObraModel, Integer> {

    List<ObraModel> findByIdArtistaAndPais(Integer idArtista, String pais);

}
