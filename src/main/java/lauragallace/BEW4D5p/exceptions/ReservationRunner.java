package lauragallace.BEW4D5p.exceptions;

import lauragallace.BEW4D5p.dao.BuildingDao;
import lauragallace.BEW4D5p.entities.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReservationRunner implements CommandLineRunner {
    @Autowired
    private BuildingDao buildingDao;

    @Override
    public void run(String... args) throws Exception {
        Building building = Building.builder().build();
        buildingDao.save(building);
    }
}