package pengzuojun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pengzuojun.domain.Area;
import pengzuojun.service.AreaService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/getAreas", method = RequestMethod.GET)
    private Map<String, Object> getAreas() throws Exception{
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> areaList = areaService.queryAreas();
        modelMap.put("areaList", areaList);

        return modelMap;
    }

    @RequestMapping(value = "/getAreaById", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<>();
        Area area = areaService.queryAreaById(areaId);
        modelMap.put("area", area);

        return modelMap;
    }

    @RequestMapping(value = "/addArea", method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("addArea", areaService.insertArea(area));

        return modelMap;
    }

    @RequestMapping(value = "/updateArea", method = RequestMethod.POST)
    private Map<String, Object> updateArea(@RequestBody Area area) {
        Map<String, Object> model = new HashMap<>();
        model.put("updateNum", areaService.updateArea(area));

        return model;
    }

    @RequestMapping(value = "/deleteArea", method = RequestMethod.GET)
    private Map<String, Object> deleteArea(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("deleteArea", areaService.deleteArea(areaId));

        return modelMap;
    }

}
