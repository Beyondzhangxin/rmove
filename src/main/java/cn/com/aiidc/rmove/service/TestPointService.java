package cn.com.aiidc.rmove.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.aiidc.rmove.dao.ExecuteProcedureDao;
import cn.com.aiidc.rmove.dao.OverPollutionDao;
import cn.com.aiidc.rmove.dao.TelemetryDao;
import cn.com.aiidc.rmove.dao.TestPointDao;
import cn.com.aiidc.rmove.entity.ForewarningVO;
import cn.com.aiidc.rmove.entity.OverPollution;
import cn.com.aiidc.rmove.entity.PointConditionVO;
import cn.com.aiidc.rmove.entity.PollutionInfoVO;
import cn.com.aiidc.rmove.entity.SpecificPointVO;
import cn.com.aiidc.rmove.entity.Telemetry;
import cn.com.aiidc.rmove.entity.TestPoint;
import cn.com.aiidc.rmove.entity.TestPointVO;

@Service
public class TestPointService {
      @Resource
      ExecuteProcedureDao excuteProcedureDao;
      @Resource
      TestPointDao testPointDao;
      @Resource
      OverPollutionDao overPollutionDao;
      @Resource
      TelemetryDao telemetryDao;
	public List<TestPointVO> getAll() {
		excuteProcedureDao.generatePointRate();
		List<TestPoint> list = (List<TestPoint>) testPointDao.findAll();
		List<TestPointVO> volist = new ArrayList<TestPointVO>();
		for(TestPoint tp:list){
			TestPointVO vo = new TestPointVO();
			vo.setId(tp.getId());
			vo.setPointLat(tp.getPointLat());
			vo.setPointLng(tp.getPointLng());
			vo.setPointName(tp.getPointName());
			Integer total = tp.getTotal();
			Integer sesscu = tp.getSuccessCount();
			if(total==null||total.intValue()==0||sesscu==null||sesscu.intValue()==0){
				vo.setPercentage(0.0);
			}else{
				vo.setPercentage(sesscu*1.0/total);
			}
			volist.add(vo);
		}
		return volist;
	}
	public SpecificPointVO getOne(Long id) {
		SpecificPointVO vo = new SpecificPointVO();
		TestPoint tp = testPointDao.findOne(id);
		//找到点上所遇的超标车辆，以时间降序排列
		List<OverPollution> olist = overPollutionDao.findByTestPointId(id);
		if(olist!=null&&olist.size()>0){
			OverPollution op = olist.get(0);
			Telemetry te = telemetryDao.findByTestNo(op.getTestNo());
			vo.setCo(te.getCo());
			vo.setHc(te.getHc());
			vo.setNox(te.getNox());
			vo.setPm(te.getPm());
			vo.setYdz(te.getYdz());
			vo.setLicense(te.getLicense());
		}
		vo.setId(id);
		vo.setPointName(tp.getPointName());
	    vo.setAddr(tp.getAddr());
	    vo.setTotal(tp.getTotal());
		return vo;
	}
	public List<ForewarningVO> getForewarining() {
		List<OverPollution> olist = overPollutionDao.findIntoday();
		List<OverPollution> sublist = null;
		if(olist.size()>9){
			sublist = olist.subList(0, 10);
		}else{
			sublist = olist;
		}
		TestPoint tp = null;
		List<ForewarningVO> flist = new ArrayList<ForewarningVO>();
		for(OverPollution op:sublist){
			tp = testPointDao.findOne(op.getTestPointId());
			ForewarningVO fw = new ForewarningVO();
			fw.setOverId(op.getTestNo());
			fw.setPointId(tp.getId());
			fw.setCity(tp.getCity());
			fw.setLicense(op.getLicense());
			fw.setPointName(tp.getPointName());
			String addr = tp.getAddr();
			addr=addr.substring(tp.getCity().length()+1);
			fw.setStreet(addr);
			flist.add(fw);
		}
		return flist;
	}
	public PointConditionVO getCondition(String id) {
		Telemetry te = telemetryDao.findOne(id);
		PointConditionVO vo = new PointConditionVO();
		vo.setTemp(te.getTemp());
		vo.setHum(te.getHum());
		vo.setWspeed(te.getWspeed());
		vo.setBp(te.getBp());
		vo.setSpeed(te.getSpeed());
		vo.setAcc(te.getAcc());
		vo.setVsp(te.getVsp());
		vo.setSlope(te.getSlope());
		vo.setPointId(te.getTestPointId());
		return vo;
	}
	public PollutionInfoVO getPollutionInfo(String id) {
		Telemetry te = telemetryDao.findOne(id);
		PollutionInfoVO vo = new PollutionInfoVO();
		vo.setId(id);
		vo.setPm(te.getPm());
		vo.setNox(te.getNox());
		vo.setCo(te.getCo());
		vo.setHc(te.getHc());
		vo.setYdz(te.getYdz());
		vo.setRgb(te.getRgb());
		return vo;
	}
}
