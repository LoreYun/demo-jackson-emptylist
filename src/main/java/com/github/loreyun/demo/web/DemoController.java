package com.github.loreyun.demo.web;

import com.github.loreyun.demo.web.response.DemoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);


	@RequestMapping(value = "/emptyListTest", method = RequestMethod.GET)
	public ResponseEntity<DemoResponse> emptyListTest() {
		logger.debug("===DemoController - / GET emptyListTest");
		DemoResponse response = new DemoResponse();
		return new ResponseEntity(response, HttpStatus.OK);
	}
}

