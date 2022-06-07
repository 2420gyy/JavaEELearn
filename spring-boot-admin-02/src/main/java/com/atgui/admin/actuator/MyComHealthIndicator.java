package com.atgui.admin.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyComHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String, Object> map = new HashMap<>();
//        业务判断代码：
        if(1==1){
//            builder.up();
            builder.status(Status.UP);
            map.put("count",1);
        }else{
            builder.down();
            map.put("error","超时");
        }
        builder.withDetail("code",100).withDetails(map);
//        "myCom":{"status":"UP","details":{"code":100,"count":1}}
    }
}
