package com.sato.dao; 

import java.util.List;

import org.springframework.stereotype.Component;

import com.sato.dto.tbl.MasterTblDto;

@Component
public interface Dao {
	public List<MasterTblDto> selectAll();

}
