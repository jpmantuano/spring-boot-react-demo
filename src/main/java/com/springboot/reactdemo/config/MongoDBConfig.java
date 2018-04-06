package com.springboot.reactdemo.config;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MongoDBConfig {

    @Value("${mongo.nodes}")
    private String[] mongoNodes;

    @Bean
    public MongoClient mongoClient() {

        List<ServerAddress> seeds = new ArrayList<ServerAddress>();

        for (String node : mongoNodes) {
            seeds.add(new ServerAddress(node.split(":")[0], Integer.valueOf(node.split(":")[1])));
        }

        return new MongoClient(seeds);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "iwpro_monitoring");
    }
}
