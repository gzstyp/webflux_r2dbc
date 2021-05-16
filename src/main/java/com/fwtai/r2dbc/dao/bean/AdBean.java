package com.fwtai.r2dbc.dao.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("ad")
public class AdBean {

    @Id
    private Integer id;

    private String name;

    private String link;

    private String url;

    private String content;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Byte deleted;
}