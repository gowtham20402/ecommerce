//package com.example.ecommerce.config;
//
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//@Configuration
//@EnableMongoRepositories(basePackages = "com.example.ecommerce.repository")
//public class MongoDBConfig extends AbstractMongoClientConfiguration {
//
//    @Override
//    protected String getDatabaseName() {
//        return "cluster0"; // Replace with your actual database name
//    }
//
//    @Override
//    @Bean
//    public MongoClient mongoClient() {
//        ConnectionString connectionString = new ConnectionString("mongodb+srv://gowtham20402:gowgowtham@cluster0.z5qjgdx.mongodb.net/cluster0?retryWrites=true&w=majority");
//        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .build();
//
//        return MongoClients.create(mongoClientSettings);
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoClient(), getDatabaseName());
//    }
//}
