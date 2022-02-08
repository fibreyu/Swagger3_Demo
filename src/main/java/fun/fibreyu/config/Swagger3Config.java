package fun.fibreyu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author fibreyu
 * @since 1.0.0
 */
@Configuration
public class Swagger3Config {
    /**
     * 配置swagger的Docket bean
     * @return
     */
/*    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30) // 指定swagger3.0版本
                .select()           // 过滤API
                //.apis(RequestHandlerSelectors.basePackage("fun.fibreyu.controller"))
                //.apis(RequestHandlerSelectors.any())
                //.apis(RequestHandlerSelectors.none())
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(createApiInfo())
                .enable(true);                     // 开关
    }*/

    @Bean
    public Docket createRestApi1() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("组1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("fun.fibreyu.controller.one"))
                .build()
                .apiInfo(createApiInfo1())
                .enable(true);
    }

    /**
     * 配置swagger的ApiInfo bean
     *
     * @return
     */
    @Bean
    public ApiInfo createApiInfo1() {
        return new ApiInfo(
                "fibreyu swagger-1"
                ,"fibreyu Api Document-1"
                ,"3.0"
                ,"http://fibreyu.fun"
                ,new Contact("fibreyu", "http://fibreyu.fun", "fibreyu@gmail.com")
                ,"Apache 2.0"
                ,"http://www.apach.org/licenses/LICENSE-2.0"
                ,new ArrayList<>()
        );
    }

    @Bean
    public Docket createRestApi2() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("组2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("fun.fibreyu.controller.two"))
                .build()
                .apiInfo(createApiInfo2())
                .enable(true);
    }

    /**
     * 配置swagger的ApiInfo bean
     *
     * @return
     */
    @Bean
    public ApiInfo createApiInfo2() {
        return new ApiInfo(
                "fibreyu swagger-2"
                ,"fibreyu Api Document-2"
                ,"3.0"
                ,"http://fibreyu.fun"
                ,new Contact("fibreyu2", "http://fibreyu.fun", "fibreyu@gmail.com")
                ,"Apache 2.0"
                ,"http://www.apach.org/licenses/LICENSE-2.0"
                ,new ArrayList<>()
        );
    }

}
