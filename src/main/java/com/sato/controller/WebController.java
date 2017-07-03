package com.sato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sato.dto.tbl.MasterTblDto;
import com.sato.service.WebService;

@Controller
public class WebController {
	
	@Autowired
	WebService webService;
	
    @RequestMapping("/")
    @ResponseBody
    List<MasterTblDto> home() {
		List<MasterTblDto> masterTblDtoList = webService.getAllMaster();
		return masterTblDtoList;
    }
}