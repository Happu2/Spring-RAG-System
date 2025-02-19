package com.soturit.springrag;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringragApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringragApplication.class, args);
	}
	@Configuration
	class AppConfig {
		@Bean
		VectorStore vectorStore(EmbeddingModel embeddingModel) {
			return SimpleVectorStore.builder(embeddingModel).build();
		}
	}

}
