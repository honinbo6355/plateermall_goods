package com.plateer.mapper;

import com.plateer.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {

    String insert(Goods goods);

    Goods select(String goodsCode);

    void update(Goods goods);

    void delete(String goodsCode);
}
