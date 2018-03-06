package com.github.loreyun.demo.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * @Author: LoreYun
 * @Date: 2018/3/6 9:59
 * @Description:
 */
@Component
@Primary
public class CustomObjectMapper extends ObjectMapper {
	private static final long serialVersionUID = 1L;
	private static final String defaultNullValue = "";

	public CustomObjectMapper() {
		super();
		//set null to ""
		//but empty list  need convert to []
		this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
			@Override
			public void serialize(Object value, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
				jg.writeString(defaultNullValue);
			}
		});

		//solution 1 : The list in HashMap can't convert to []
		//https://www.cnblogs.com/lic309/p/5048631.html
		this.setSerializerFactory(this.getSerializerFactory().withSerializerModifier(new MyBeanSerializerModifier()));
	}

	//solution 2: write in kotlin, I can't rewrite it in Java
	//https://github.com/FasterXML/jackson-databind/issues/347

}
