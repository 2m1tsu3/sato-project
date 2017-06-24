package com.sato.mapper;

import java.util.List;

import com.sato.dto.tbl.MasterTblDto;

public interface MasterMapper {
	public List<MasterTblDto> selectAll();
}
