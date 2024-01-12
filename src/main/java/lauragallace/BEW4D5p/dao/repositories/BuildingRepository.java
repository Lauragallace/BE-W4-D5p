package lauragallace.BEW4D5p.dao.repositories;

import lauragallace.BEW4D5p.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BuildingRepository extends JpaRepository<Building, UUID> {

//    Building findById(String id);

    List<Building> findByCity(String city);
}