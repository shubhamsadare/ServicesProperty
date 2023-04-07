package com.ConfigClient.clientside.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@ConfigurationProperties
@RefreshScope
@Data
@Configuration
public class DbSetting {

	@Value("${dbname}")
	private String dbname;

	@Value("${user}")
	private String info;

	@Value("${role}")
	private String role;

	@Value("${db.pass}")
	private String dbpass;
}
