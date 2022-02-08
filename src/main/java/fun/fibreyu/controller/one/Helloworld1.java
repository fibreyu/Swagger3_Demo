package fun.fibreyu.controller.one;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fibreyu
 * @since 1.0.0
 */
@Api(tags = "开发组1")
@RestController
public class Helloworld1 {

    @ApiOperation("group1")
    @GetMapping("/helloworld1")
    public String helloworld() {
        return "helloworld1";
    }
}
