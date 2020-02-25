package pengzuojun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pengzuojun.dao.AreaDao;
import pengzuojun.domain.Area;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AreaService {
    @Autowired
    AreaDao areaDao;

    public List<Area> queryAreas() throws Exception{
        List<Area> areaList = areaDao.queryAreas();
        // 日期格式化：mybatis从数据库读取出来的格式是国际格式
        for (Area area : areaList) {
            Date createTime = area.getCreateTime();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String createTimeStr = format.format(createTime);
            System.err.println("-------------createTimeStr:" + createTimeStr);
            area.setAreaName(createTimeStr);
        }
        return areaList;
    }

    public Area queryAreaById(Integer areaId) {
        return areaDao.queryAreaById(areaId);
    }

    public Integer insertArea(Area area) {
        return areaDao.insertArea(area);
    }

    public Integer updateArea(Area area) {
        return areaDao.updateArea(area);
    }

    public Integer deleteArea(Integer areaId) {
        return areaDao.deleteArea(areaId);
    }
}
