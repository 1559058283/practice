package com.xiangmu.practice_paicoding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiangmu.practice_paicoding.model.Username;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GetUserNameMapper extends BaseMapper<Username> {
}
