package com.sato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sato.dto.tbl.MasterTblDto;
import com.sato.repository.WebRepository;

@Component
public class DefaultWebService implements WebService {
	@Autowired
	WebRepository webRepository;
	
	public List<MasterTblDto> getAllMaster() {
		return webRepository.getAllMaster();
	}

}
