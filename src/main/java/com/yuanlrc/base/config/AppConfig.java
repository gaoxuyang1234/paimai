package com.yuanlrc.base.config;

import com.yuanlrc.base.entity.admin.OrderAuth;
import com.yuanlrc.base.service.admin.OrderAuthService;
import com.yuanlrc.base.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppConfig implements CommandLineRunner {

	
	public static int ORDER_AUTH = 1;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>>>>>>>>>>>>>服务启动执行  <<<<<<<<<<<<<");
	}
}
