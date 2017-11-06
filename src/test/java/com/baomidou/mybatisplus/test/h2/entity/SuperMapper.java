package com.baomidou.mybatisplus.test.h2.entity;

/**
 * <p>
 * 自定义父类 SuperMapper
 * </p>
 *
 * @author hubin
 * @date 2017-06-26
 */
public interface SuperMapper<T,PK> extends com.baomidou.mybatisplus.mapper.BaseMapper<T,PK> {

    // 这里可以写 mapper 层公共方法、 注意！！ 不要让在 mapper 目录让 mp 扫描到!!
}
