package fun.fibreyu.controller;

import fun.fibreyu.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author fibreyu
 * @since 1.0.0
 */
@Api(tags = "helloworld 类测试")
@RestController
public class HelloWorldController {

    @ApiOperation("helloworld测试方法")
    @RequestMapping("/helloworld")
    public String helloworld() {
        return "helloworld";
    }

    @PostMapping
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "query"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true, paramType = "query", dataType = "Integer")
    })
    @ApiOperation("测试查询")
    public String search(String name, Integer age) {
        return name + ":" + age;
    }

    @PostMapping("/add")
    @ApiOperation("测试添加")
    public String add(User user) {
        return user.getName() + ":" + user.getAge();
    }

    @GetMapping("/user/{id}")
    @ApiOperation("根据ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户编号", required = true, paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = 408, message = "指定业务报错信息，返回客户端"),
            @ApiResponse(code = 400, message = "请求参数错误"),
            @ApiResponse(code = 404, message = "请求路径错误或跳转路径错误")
    })
    public User load(@PathVariable("id") Integer id) {
        return new User(id, 32, "jack");
    }
}
