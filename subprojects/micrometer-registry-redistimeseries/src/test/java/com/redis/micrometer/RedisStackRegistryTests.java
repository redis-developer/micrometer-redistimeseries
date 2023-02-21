package com.redis.micrometer;

import com.redis.testcontainers.RedisServer;
import com.redis.testcontainers.RedisStackContainer;

public class RedisStackRegistryTests extends BaseRegistryTests {

	private static final RedisStackContainer container = new RedisStackContainer(
			RedisStackContainer.DEFAULT_IMAGE_NAME.withTag(RedisStackContainer.DEFAULT_TAG));

	@Override
	RedisServer getRedisServer() {
		return container;
	}

}