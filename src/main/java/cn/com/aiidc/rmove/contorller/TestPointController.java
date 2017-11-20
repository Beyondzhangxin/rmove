package cn.com.aiidc.rmove.contorller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.aiidc.rmove.entity.ForewarningVO;
import cn.com.aiidc.rmove.entity.PointConditionVO;
import cn.com.aiidc.rmove.entity.PollutionInfoVO;
import cn.com.aiidc.rmove.entity.SpecificPointVO;
import cn.com.aiidc.rmove.entity.TestPoint;
import cn.com.aiidc.rmove.entity.TestPointVO;
import cn.com.aiidc.rmove.service.TestPointService;

@Controller
@RequestMapping("/testPoint")
public class TestPointController {
     @Resource
     TestPointService testPointService;
     /**获取所有的测试点的信息并返回给前端*/
     @RequestMapping("/show")
     @ResponseBody
     public List<TestPointVO> show(){
    	  return testPointService.getAll();
     }
     /**根据检测点的Id获取相对应的信息*/
     @RequestMapping("/point")
     @ResponseBody
     public SpecificPointVO point(Long id){
    	 return testPointService.getOne(id);
     }
     /**获取当天的预警信息*/
     @RequestMapping("/forewarning")
     @ResponseBody
     public List<ForewarningVO> foreWaring(){
    	  return testPointService.getForewarining();
     }
     /**
      * @param id 超标记录的id实际上是 test_no
      * @return
      */
     @RequestMapping("/pointCondition")
     @ResponseBody
     public PointConditionVO pointCondition(String id){
    	 return testPointService.getCondition(id);
     }
    /**
     * @param id telemetry_info中的test_no字段
     * @return
     */
    @RequestMapping("/pollutionInfo")
    @ResponseBody
    public PollutionInfoVO pollutionInfo(String id){
    	 return testPointService.getPollutionInfo(id);
    }
}
