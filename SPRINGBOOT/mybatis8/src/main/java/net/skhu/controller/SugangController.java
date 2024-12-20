package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.skhu.mapper.SugangMapper;

@Controller
public class SugangController {

	@Autowired
	SugangMapper sugangMapper;

	// http://localhost:8088/sugang/list
	@GetMapping("sugang/list")
	public String list(Model model) {

		model.addAttribute("sugangs",   sugangMapper.findAll() );


		return "sugang/list";
	}



}









