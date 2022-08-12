package br.com.araujoit.crmconfigapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CrmConfigApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmConfigApiApplication.class, args);
	}

}
