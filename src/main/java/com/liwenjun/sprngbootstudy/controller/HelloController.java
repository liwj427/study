package com.liwenjun.sprngbootstudy.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author liwenjun
 * @Date 2021/8/16 7:56 下午
 * @Version: 1.0
 */

@RestController
@Api(tags = "首页管理")
public class HelloController {


    @GetMapping("home")
    @ApiOperation(value = "首页")
    public String home( ) throws Exception {
        return "success";
    }

    @GetMapping("queryByName")
    @ApiOperation(value = "根据姓名查询")
    public String hello(@RequestParam("name")String name) throws Exception {
        return name;
    }
}
