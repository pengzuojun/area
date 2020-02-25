package pengzuojun.dao;

import org.springframework.stereotype.Repository;
import pengzuojun.domain.Area;

import java.util.List;

@Repository
public interface AreaDao {
    List<Area> queryAreas();

    Area queryAreaById(Integer id);

    Integer insertArea(Area area);

    Integer updateArea(Area area);

    Integer deleteArea(Integer areaId);
}
