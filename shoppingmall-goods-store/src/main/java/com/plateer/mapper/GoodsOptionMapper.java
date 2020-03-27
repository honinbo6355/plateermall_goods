package com.plateer.mapper;

import com.plateer.domain.Option;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsOptionMapper {

    String insert(String goodsCode, String optionText);

    List<Option> select(String goodsCode);

    void update(String goodsCode, String optionText, String newOptionText);

    void delete(String goodsCode, String optionText);
}