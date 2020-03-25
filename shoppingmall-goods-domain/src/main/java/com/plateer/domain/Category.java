package com.plateer.domain;

import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {

    String uuid;
    String name;
    String parentsId;
    List<String> goodsList;
}
