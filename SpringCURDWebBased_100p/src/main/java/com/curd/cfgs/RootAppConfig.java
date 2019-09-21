package com.curd.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceAppConfig.class, PersistenceAppConfig.class})
public class RootAppConfig {

}
