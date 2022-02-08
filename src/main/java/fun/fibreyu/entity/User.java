package fun.fibreyu.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

/**
 * @author fibreyu
 * @since 1.0.0
 */
@ApiModel("用户实体")
public class User {
    @ApiModelProperty("编号")
    private Integer id;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("姓名")
    private String name;

    public User(Integer id) {
    }

    public User(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
