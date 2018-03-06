package com.github.loreyun.demo.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @Author: LoreYun
 * @Date: 2018/3/6 10:42
 * @Description: https://www.cnblogs.com/lic309/p/5048631.html
 */
public class MyNullArrayJsonSerializer extends JsonSerializer<Object> {
	@Override
	public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
		if (value == null) {
			jgen.writeStartArray();
			jgen.writeEndArray();
		} else {
			jgen.writeObject(value);
		}
	}
}
