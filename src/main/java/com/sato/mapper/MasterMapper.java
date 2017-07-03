package com.sato.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sato.dto.tbl.MasterTblDto;

@Mapper
public interface MasterMapper {
	public List<MasterTblDto> selectAllMaster();
}
