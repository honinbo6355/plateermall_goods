package com.plateer.mapper;

import com.plateer.domain.InfoTableRow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsInfoMapper {

    String insert(String goodsCode, String head, String body);

    List<InfoTableRow> select(String goodsCode);

    void update(String goodsCode, String head, String newHead, String newBody);

    void delete(String goodsCode, String head);
}