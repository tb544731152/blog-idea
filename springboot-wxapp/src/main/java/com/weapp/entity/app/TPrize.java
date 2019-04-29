package com.weapp.entity.app;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 奖品配置
 * @author zk
 *
 */
@Document(collection="t_prize")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TPrize {
	@Id
	private String id;
	private String prizeName;
	private String stage;
	private Integer start;
	private Integer end;
	private String createDate;
	
}
