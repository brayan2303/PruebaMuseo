package example.repository;

import example.model.MuseoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MuseoRepository extends JpaRepository<MuseoModel, Integer> {

    @Query(value = "{call sp_MuseosPorCiudadYLetra(:ciudad, :nombre)}", nativeQuery = true)
    List<MuseoModel> sp_MuseosPorCiudadYLetra(@Param("ciudad") String ciudad, @Param("nombre") String nombre);
}
