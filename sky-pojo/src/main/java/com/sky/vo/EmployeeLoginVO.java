package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder  //构建器作用：EmployeeLoginVO的对象可以直接
        // EmployeeLoginVO employeeLoginVO = EmployeeLoginVO.builder()
        //                                  .id(employee.getId())
        //                                  .userName(employee.getUsername())
        //                                  .name(employee.getName())
        //                                  .token(token)来构建对象，不用一个一个getset
        //                                  .build();最后调用一下build方法，构建好
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {

    @ApiModelProperty("主键值")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("jwt令牌")
    private String token;

}
