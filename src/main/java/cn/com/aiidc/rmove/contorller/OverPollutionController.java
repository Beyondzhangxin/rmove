package cn.com.aiidc.rmove.contorller;

import cn.com.aiidc.rmove.entity.OverPollutionData;
import cn.com.aiidc.rmove.service.OverPollutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by Zhangx on 2017/11/16 at 11:52.
 */
@Controller
@RequestMapping("countOverPollution")
public class OverPollutionController
{
    @Autowired
    private OverPollutionService overPollutionService;

    @RequestMapping(value = "countFueltype", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<OverPollutionData> countByFueltype(String areaId, String vehicleType, String pollutionType) throws ParseException
    {
        Date startDate = new DateFormatter("yyyy-MM-dd HH:mm:ss").parse("2017-01-01 20:20:20", Locale.CHINA);
        Date endDate = new DateFormatter("yyyy-MM-dd HH:mm:ss").parse("2018-01-01 20:20:20", Locale.CHINA);
        List<OverPollutionData> co = overPollutionService.findByFuelType(areaId, startDate, endDate, vehicleType, pollutionType);
        return co;
    }

}
