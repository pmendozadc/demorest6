package com.example.demorest6;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("*")
@RestController
public class RestDemo {

	public RestDemo() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("consultar")
	public Map<String, Object> consultar() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uno", 1);
		map.put("dos", 2);
		return map;
	}

	@PostMapping("registrar")
	public Map<String, Object> registrar(@RequestBody Map<String, Object> nuevo) {
		return nuevo;
	}
}
