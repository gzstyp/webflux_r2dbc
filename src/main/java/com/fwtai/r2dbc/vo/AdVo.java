package com.fwtai.r2dbc.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdVo {

    private String name;

    private String link;

    private String url;

    private String content;
}