package com.plateer.mapper;

import com.plateer.domain.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsCategoryMapper {

    String insert(String goodsCode, String head, String body);

    List<Category> select(String goodsCode);

    void update(String goodsCode, String head, String newHead, String newBody);

    void delete(String goodsCode, String head);
}