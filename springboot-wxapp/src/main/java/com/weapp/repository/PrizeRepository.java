package com.weapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.weapp.entity.app.TPrize;
/**
 * 奖品配置
 * @author zk 
 *
 */
public interface PrizeRepository extends MongoRepository<TPrize, String> {
	
	List<TPrize> queryByStage(String stage);
}
