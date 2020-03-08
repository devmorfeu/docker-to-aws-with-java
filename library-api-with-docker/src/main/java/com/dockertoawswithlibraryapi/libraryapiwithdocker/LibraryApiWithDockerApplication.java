package com.dockertoawswithlibraryapi.libraryapiwithdocker;

import com.dockertoawswithlibraryapi.libraryapiwithdocker.config.FileStorageConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageConfig.class
})
@EnableAutoConfiguration
@ComponentScan
public class LibraryApiWithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApiWithDockerApplication.class, args);
	}

}
