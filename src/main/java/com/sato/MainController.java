package com.sato;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sato.dao.Dao;
import com.sato.dao.DefaultDao;
import com.sato.dto.tbl.MasterTblDto;

@Controller
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    List<MasterTblDto> home() {
        Dao dao = new DefaultDao();
		List<MasterTblDto> masterTblDtoList = dao.selectAll();
		return masterTblDtoList;
    }
}