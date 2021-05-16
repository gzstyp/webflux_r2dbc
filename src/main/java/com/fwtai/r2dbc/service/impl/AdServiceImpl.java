package com.fwtai.r2dbc.service.impl;

import com.fwtai.r2dbc.dao.bean.AdBean;
import com.fwtai.r2dbc.dao.repository.AdRepository;
import com.fwtai.r2dbc.service.AdService;
import com.fwtai.r2dbc.vo.AdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AdServiceImpl implements AdService{

    @Autowired
    private AdRepository adRepository;

    /**
     * 查询现在的的广告
    */
    @Override
    public Flux<AdVo> findAll(){
        return adRepository.findAll()
            .map(adBean -> AdVo.builder()
                .name(adBean.getName())
                .link(adBean.getLink())
                .url(adBean.getUrl())
                .content(adBean.getContent())
                .build());
    }

    @Override
    public Mono<AdBean> save(final AdBean vo){
        final Mono<AdBean> beanMono = adRepository.save(vo);
        return beanMono;
    }
}
