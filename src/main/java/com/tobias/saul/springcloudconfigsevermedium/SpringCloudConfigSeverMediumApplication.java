package com.tobias.saul.springcloudconfigsevermedium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigSeverMediumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigSeverMediumApplication.class, args);
	}

}
