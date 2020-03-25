package com.plateer.mapper;

import com.plateer.domain.Option;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsOptionMapper {

    String insert(String goodsCode, String option);

    List<Option> select(String goodsCode);

    void update(String goodsCode, String option, String newOption);

    void delete(String goodsCode, String option);
}