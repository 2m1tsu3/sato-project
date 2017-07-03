package com.sato.repository; 

import java.util.List;

import org.springframework.stereotype.Component;

import com.sato.dto.tbl.MasterTblDto;

@Component
public interface WebRepository {
	public List<MasterTblDto> getAllMaster();
}
