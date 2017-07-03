package com.sato.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sato.dto.tbl.MasterTblDto;

@Component
public interface WebService {
	public List<MasterTblDto> getAllMaster();

}