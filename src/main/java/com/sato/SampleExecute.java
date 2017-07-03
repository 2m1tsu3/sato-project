package com.sato;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sato.dto.tbl.MasterTblDto;
import com.sato.mapper.MasterMapper;

@Component
public class SampleExecute{

	@Autowired
	MasterMapper masterMapper;

	void start()  throws Exception {
		List<MasterTblDto> masterTblDtoList = masterMapper.selectAll();
		System.out.println("ok");
		for (MasterTblDto mastarTblDto : masterTblDtoList) {
			System.out.println("ID: "+ mastarTblDto.getId());
		}
		
	}

}
