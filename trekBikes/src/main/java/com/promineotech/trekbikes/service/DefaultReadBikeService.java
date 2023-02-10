package com.promineotech.trekbikes.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.ReadBikeDao;
import com.promineotech.trekbikes.entity.*;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DefaultReadBikeService implements ReadBikeService {
	@Autowired
	private ReadBikeDao readBikeDao;
	@Transactional	
	@Override
	public List<Bike> fetchBike(String color, String drivetrain, String frameset, String handlebar, String saddle, String tire){
		log.info("DeleteBike has been deleted Color={}, Drivetrain={}, Frameset={}, Handlebar={}, Saddle={}, Tire={}", color, drivetrain, frameset, handlebar, saddle, tire);
		return readBikeDao.fetchBike(color, drivetrain, frameset, handlebar, saddle, tire);
	}
//	public List<Color> fetchColor(String color){
//		log.info("DeleteBike has been deleted Color={}", color);
//		return readBikeDao.fetchColor(color);
//	}
//	public List<Drivetrain> fetchDrivetrain(String drivetrain){
//		log.info("DeleteBike has been deleted Drivetrain",drivetrain);
//		return readBikeDao.fetchDrivetrain(drivetrain);
//	}
//	public List<Frameset> fetchFrameset(String frameset){
//		log.info("DeleteBike has been deleted Frameset={}", frameset);
//		return readBikeDao.fetchFrameset(frameset);
//	}
//	public List<Handlebar> fetchHandlebar(String handlebar){
//		log.info("DeleteBike has been deleted Handlebar={}", handlebar);
//		return readBikeDao.fetchHandlebar(handlebar);
//	}
//	public List<Saddle> fetchSaddle(String saddle){
//		log.info("DeleteBike has been deleted Saddle={}", saddle);
//		return readBikeDao.fetchSaddle(saddle);
//	}
//	public List<Tire> fetchTire(String tire){
//		log.info("DeleteBike has been deleted Tire={}", tire);
//		return readBikeDao.fetchTire(tire);
//	}
	
}
