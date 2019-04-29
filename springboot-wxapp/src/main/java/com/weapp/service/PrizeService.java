package com.weapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weapp.entity.app.TPrize;
import com.weapp.repository.PrizeRepository;

@Service
public class PrizeService {
	
	@Autowired
	private PrizeRepository prizeRepository;
	
	public void save(TPrize prizes) {
		prizeRepository.save(prizes);
	}
	
	
	public List<TPrize> queryByStage(String stage){
		return prizeRepository.queryByStage(stage);
	}
}

