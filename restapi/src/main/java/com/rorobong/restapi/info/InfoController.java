package com.rorobong.restapi.info;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rorobong.restapi.info.model.Project;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class InfoController {
	@GetMapping("/info")
	public Object projectInfo() {
		log.debug("/info start");
		
		Project prj = new Project();
		prj.projectName = "restapi";
		prj.author = "root";
		prj.createDate = new Date();
		return prj;
	}
}
