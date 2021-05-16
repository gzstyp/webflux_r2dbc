package com.fwtai.r2dbc.service;

import com.fwtai.r2dbc.dao.bean.AdBean;
import com.fwtai.r2dbc.vo.AdVo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AdService {

    /**
     * 查询现在的的广告
     * @return
    */
    Flux<AdVo> findAll();

    public Mono<AdBean> save(final AdBean ad);
}