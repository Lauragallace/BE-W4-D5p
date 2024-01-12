package lauragallace.BEW4D5p.dao;

import lauragallace.BEW4D5p.entities.Station;
import lauragallace.BEW4D5p.entities.StationType;

import java.util.List;

public interface StationDao {
    public void save(Station station);

    public Station findById(String id);

    List<Station> findAllAvailable();

    List<Station> findByTypeAndCity(StationType type, String city);
}