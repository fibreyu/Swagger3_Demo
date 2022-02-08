package fun.fibreyu.controller.two;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fibreyu
 * @since 1.0.0
 */
@Api(tags = "开发组2")
@RestController
public class Helloworld2 {

    @ApiOperation("group2")
    @GetMapping("/helloworld2")
    public String helloworld() {
        return "helloworld2";
    }
}
