package cn.com.aiidc.rmove.contorller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.aiidc.rmove.entity.NameAndIdVo;
import cn.com.aiidc.rmove.entity.StatisticsVO;
import cn.com.aiidc.rmove.entity.Telemetry;
import cn.com.aiidc.rmove.service.StatisticsService;

@Controller
@RequestMapping("operatingStatistics")
public class StatisticsController {
      @Resource
      StatisticsService statisticsService;
      @RequestMapping("getPoint")
      @ResponseBody
      public List<NameAndIdVo> getPoint(String province,String city){
    	   return statisticsService.getAllPoint(province,city);
      }
      @RequestMapping("statistics")
      @ResponseBody
      public StatisticsVO statistics(String city,String province,String start,String end) throws ParseException{
    	    return statisticsService.statistics(province,city,start,end);
      }
      @RequestMapping("test")
      @ResponseBody
      public List<Telemetry> test(String start,String end) throws ParseException{
    	     SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
    	     Date startDate = fmt.parse(end);
    	     Date endDate = new Date();
    	     List<Long> ids = new ArrayList<Long>();
    	     ids.add(1l);
    	     ids.add(2l);
    	     return statisticsService.test(startDate,endDate,ids);
      }
}
