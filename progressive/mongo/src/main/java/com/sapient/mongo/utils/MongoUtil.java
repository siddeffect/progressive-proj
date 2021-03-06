package com.sapient.mongo.utils;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoClients;

public class MongoUtil {
	public static MongoClient mongoUtil() {
		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		
		MongoClientSettings settings = MongoClientSettings.builder()
		        .codecRegistry(pojoCodecRegistry)
		        .build();
		
		return new MongoClient("172.17.0.3", MongoClientOptions.builder()
.codecRegistry(pojoCodecRegistry)
.build());
	}

}
