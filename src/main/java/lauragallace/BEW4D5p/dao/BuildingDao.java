package lauragallace.BEW4D5p.dao;



import lauragallace.BEW4D5p.entities.Building;

import java.util.List;
import java.util.UUID;

public interface BuildingDao {
    public void save(Building building);

    public Building findById(UUID id);

    public List<Building> findByCity(String city);

}