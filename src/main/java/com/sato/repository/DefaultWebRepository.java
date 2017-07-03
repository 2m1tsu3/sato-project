package com.sato.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sato.dto.tbl.MasterTblDto;
import com.sato.mapper.MasterMapper;


@Component
public class DefaultWebRepository implements WebRepository {
	
	@Autowired
	MasterMapper masterMapper;
	
//	private SqlSessionFactory sessionFactory;
//	
//	public DefaultWebRepository() {
//		sessionFactory = DaoUtil.getSqlSessionFactory();
//	}

	public List<MasterTblDto> getAllMaster() { 
		return masterMapper.selectAllMaster();
	}
}