package com.sankuai.inf.leaf;

import com.sankuai.inf.leaf.common.Result;

/**
 * ID生成器接口
 */
public interface IDGen {

    /** 初始化 */
    boolean init();

    /** 获取ID：key为biz_tag业务标识 */
    Result get(String key);

}
