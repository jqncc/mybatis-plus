package com.baomidou.mybatisplus.test.h2.entity.persistent;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * Base Entity
 * </p>
 *
 * @author yuxiaobin
 * @date 2017/6/26
 */
@Data
@Accessors(chain = true)
public abstract class BaseIntVersionEntity implements Serializable {

    /* 主键ID 注解，value 字段名，type 用户输入ID */
    @TableId(value = "test_id")
    private Long id;

    @Version
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
