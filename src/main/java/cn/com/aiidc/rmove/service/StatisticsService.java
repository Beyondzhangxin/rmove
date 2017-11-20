package cn.com.aiidc.rmove.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.com.aiidc.rmove.dao.OverPollutionDao;
import cn.com.aiidc.rmove.dao.TelemetryDao;
import cn.com.aiidc.rmove.dao.TestPointDao;
import cn.com.aiidc.rmove.entity.NameAndIdVo;
import cn.com.aiidc.rmove.entity.OverPollution;
import cn.com.aiidc.rmove.entity.StatisticsVO;
import cn.com.aiidc.rmove.entity.Telemetry;
import cn.com.aiidc.rmove.entity.TestPoint;

@Service
public class StatisticsService {
    @Resource
    TestPointDao testPointDao;
    @Resource
    TelemetryDao telemetryDao;
    @Resource
    OverPollutionDao overPollutionDao;
	public List<NameAndIdVo> getAllPoint(String province, String city) {
		List<NameAndIdVo> nlist = new ArrayList<NameAndIdVo>();
		if(StringUtils.hasLength(province)&&StringUtils.hasLength(city)){
			//两个参数都有值
			List<TestPoint> list = testPointDao.findByProvinceAndCity(province,city);		
			for(TestPoint tp:list){
				NameAndIdVo vo = new NameAndIdVo();
				vo.setId(tp.getId());
				vo.setPointName(tp.getPointName());
				nlist.add(vo);
			}
		 }else if(!StringUtils.hasLength(province)&&StringUtils.hasLength(city)){
			//只有城市
			 List<TestPoint> list = testPointDao.findByCity(city);		
				for(TestPoint tp:list){
					NameAndIdVo vo = new NameAndIdVo();
					vo.setId(tp.getId());
					vo.setPointName(tp.getPointName());
					nlist.add(vo);
				}   
		 }else if(StringUtils.hasLength(province)&&!StringUtils.hasLength(city)){
			//只有省
			 List<TestPoint> list = testPointDao.findByProvince(province);		
				for(TestPoint tp:list){
					NameAndIdVo vo = new NameAndIdVo();
					vo.setId(tp.getId());
					vo.setPointName(tp.getPointName());
					nlist.add(vo);
				}   
		 }
		 else if(!StringUtils.hasLength(province)&&!StringUtils.hasLength(city)){
			//两个都没值
			 List<TestPoint> list = (List<TestPoint>) testPointDao.findAll();		
				for(TestPoint tp:list){
					NameAndIdVo vo = new NameAndIdVo();
					vo.setId(tp.getId());
					vo.setPointName(tp.getPointName());
					nlist.add(vo);
				}   
		 }
		return nlist;
	}
	private List<Long> getPointId(String province,String city){
		  List<NameAndIdVo> volist = this.getAllPoint(province, city);
		  List<Long> ids = new ArrayList<Long>();
		  for(NameAndIdVo vo:volist){
			  ids.add(vo.getId());
		  }
		  return ids;
	}
	public List<Telemetry> test(Date startDate, Date endDate, List<Long> ids) {
		return telemetryDao.findByTestDateBetweenIn(startDate, endDate, ids);
	}
	//返回各种统计数据的方法
	public StatisticsVO statistics(String province, String city, String start, String end) throws ParseException {
		List<Long> ids = this.getPointId(province, city);
		//转化时间条件
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = null;
		Date endDate = null;
		if(StringUtils.hasLength(start)){
			startDate = fmt.parse(start);
		}else{
			startDate = fmt.parse("2017-11-10");
		}
		if(StringUtils.hasLength(end)){
			endDate = fmt.parse(end);
		}else{
			endDate = new Date();
		}
		//获取总的车辆数
		List<Telemetry> tlist = telemetryDao.findByTestDateBetweenIn(startDate, endDate, ids);
		//获取合格车辆数
		List<Telemetry> hglist = telemetryDao.findByTestDateBetweenInyx(startDate, endDate, ids);
		//获取所有黄标车的数目
		List<Telemetry> hblist = telemetryDao.findByTestDateBetweenInhb(startDate, endDate, ids);
		//获取所有的超标车辆
		List<OverPollution> allop = overPollutionDao.findByTestDateBetweenId(startDate, endDate, ids);
		//co超标
		List<OverPollution> co = overPollutionDao.co(startDate, endDate, ids);
		List<OverPollution> hc = overPollutionDao.hc(startDate, endDate, ids);
		List<OverPollution> nox = overPollutionDao.nox(startDate, endDate, ids);
		List<OverPollution> pm = overPollutionDao.pm(startDate, endDate, ids);
		int total = 0;
		int hg = 0;
		int hb = 0;
		int op = 0;
		int col = 0;
		int hcl = 0;
		int noxl = 0;
		int pml=0;
		if(tlist==null||tlist.size()<1){}else{total=tlist.size();}
		if(hglist==null||hglist.size()<1){}else{hg=hglist.size();}
		if(hblist==null||hblist.size()<1){}else{hb=hblist.size();}
		if(allop==null||allop.size()<1){}else{op=allop.size();}
		if(co==null||co.size()<1){}else{col=co.size();}
		if(hc==null||hc.size()<1){}else{hcl=hc.size();}
		if(nox==null||nox.size()<1){}else{noxl=nox.size();}
		if(pm==null||pm.size()<1){}else{pml=pm.size();}
		//开始设值进去
		StatisticsVO vo = new StatisticsVO();
		vo.setTotal(total*1l);
		vo.setValid(hg*1l);
		vo.setOver(op*1l);
		//设置有效率
		vo.setValidrate(div(hg*1.0,total*1.0));
		//设置车辆超标率
		vo.setOverrate(div(op*1.0,hg*1.0));
		//设置黄标车率
		vo.setYellowlabel(div(hb*1.0,total*1.0));
		//设置污染物超标占比
		vo.setCo(div(col*1.0,op*1.0));
		vo.setHc(div(hcl*1.0,op*1.0));
		vo.setNox(div(noxl*1.0,op*1.0));
		vo.setPm(div(pml*1.0,op*1.0));
		//设置污染物的辆数
		vo.setCol(col);
		vo.setHcl(hcl);
		vo.setNoxl(noxl);
		vo.setPml(pml);
		return vo;
	}
	private double div(double numerator,double  denominator){
		if(numerator==0.0)
		return 0.0;
		  BigDecimal p1 = BigDecimal.valueOf(numerator);
		  BigDecimal p2 = BigDecimal.valueOf(denominator);
		  return p1.divide(p2,2,RoundingMode.HALF_UP).doubleValue();		  
	}

}
