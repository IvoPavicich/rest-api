package restapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restapi.demo.models.Autos;

import java.util.List;

@Repository
public interface IAutoRepository extends JpaRepository<Autos,Long> {
    List<Autos> findByMarca(String marca);
}
