package com.sato.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import com.sato.dto.tbl.MasterTblDto;
import com.sato.mapper.MasterMapper;


@Component
public class DefaultDao implements Dao {
	private SqlSessionFactory sessionFactory;
	
	public DefaultDao() {
		sessionFactory = DaoUtil.getSqlSessionFactory();
	}
	public List<MasterTblDto> selectAll() { 
		SqlSession sqlSession = sessionFactory.openSession();
		MasterMapper masterMapper = sqlSession.getMapper(MasterMapper.class);
		List<MasterTblDto> masterTblDto = masterMapper.selectAll();
		sqlSession.close();
		return masterTblDto;
	}
}