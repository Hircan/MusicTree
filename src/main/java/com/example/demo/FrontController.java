package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //ctrl + shift + o 자동 임포트
public class FrontController { // 사이트 같은 느낌을 주기 위해 하는 것
	
	@RequestMapping(value = "/") // /만 입력시 index로 넘어감 똑같은 거 html같은게 여러개 있을 시 value 값 다르게 줘서 127.0.0.1/(벨류설정부분값) 벨류값만 넣을시 이동가능하게끔 설정 가능  
	public String Main() {
		return "index";
	}
	
	@RequestMapping(value = "/main") // 예시  
	public String home() {
		return "main";
	}
}
