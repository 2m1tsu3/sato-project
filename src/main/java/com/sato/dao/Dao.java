package com.sato.dao; 

import java.util.List;

import com.sato.dto.tbl.MasterTblDto;

public interface Dao {
	public List<MasterTblDto> selectAll();

}
