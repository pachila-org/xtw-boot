package org.jeecg.common.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
@ApiModel(value="积木报表用接口对象", description="接口返回对象")
public class JimuResult<T> implements Serializable  {

    private static final long serialVersionUID = 1L;

    /**
     * 返回数据对象 data
     */
    @ApiModelProperty(value = "返回数据对象")
    private T data;

    @ApiModelProperty(value = "总条数")
    private int count;

    @ApiModelProperty(value = "总页数")
    private int total;

    public JimuResult() {
    }

    public static<T> JimuResult<T> ok(T data) {
        JimuResult<T> r = new JimuResult<T>();
        r.setData(data);
        return r;
    }

}
