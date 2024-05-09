package com.rorobong.restapi.info.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
	public String projectName;
	public String author;
	public Date createDate;
}
