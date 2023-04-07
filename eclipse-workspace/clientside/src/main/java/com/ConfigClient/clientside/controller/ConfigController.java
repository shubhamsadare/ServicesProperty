package com.ConfigClient.clientside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Autowired
	private DbSetting dbsetting;

	@GetMapping("/user")
	public String info() {
		return dbsetting.getInfo() + " " + dbsetting.getRole();
	}

	@GetMapping("/db")
	public String auth() {
		return dbsetting.getInfo() + "\n name:" + dbsetting.getDbname() + "\n pass:" + dbsetting.getDbpass();
	}

}
