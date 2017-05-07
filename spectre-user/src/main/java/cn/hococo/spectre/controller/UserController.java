package cn.hococo.spectre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：账号管理
 *
 * @author Yongge
 * @version 1.0
 * @since 2017-05-02
 **/

@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    public String get(@PathVariable Long id) {
        return "success";
    }

    @GetMapping("/service_instance")
    public ServiceInstance getServiceInstance() {
        return discoveryClient.getLocalServiceInstance();
    }
}
