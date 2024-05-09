package com.rorobong.restapi.info;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.rorobong.restapi.info.model.Project;

@RestController
public class InfoController2 {
	@GetMapping("/info2")
	public Object projectInfo2() {
		JsonObject jo = new JsonObject();
		
		jo.addProperty("projectName", "restapi");
		jo.addProperty("author", "root");
		jo.addProperty("createDate", new Date().toString());
		
		JsonArray ja = new JsonArray();
		for(int i = 0; i < 5; i++) {
			JsonObject jObj = new JsonObject();
			jObj.addProperty("prop" + i, i);
			ja.add(jObj);
		}
		
		jo.add("array", ja);
		
		return jo.toString();
	}
}
