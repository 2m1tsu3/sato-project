package com.sato;

import java.util.List;

import com.sato.dao.Dao;
import com.sato.dao.DefaultDao;
import com.sato.dto.tbl.MasterTblDto;

public class Sample {

	public static void main(String[] args) {
		Dao dao = new DefaultDao();
		List<MasterTblDto> masterTblDtoList = dao.selectAll();
	for (MasterTblDto mastarTblDto : masterTblDtoList) {
		System.out.println("ID: "+ mastarTblDto.getId());
	}
	}

}
