package com.fwtai.r2dbc.controller;

import com.fwtai.r2dbc.dao.bean.AdBean;
import com.fwtai.r2dbc.service.AdService;
import com.fwtai.r2dbc.vo.AdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/ad")
public class AdController {

    @Autowired
    private AdService adService;

    // http://127.0.0.1:802/api/ad/findAll
    @GetMapping("/findAll")
    public Flux<AdVo> findNowAd() {
        return adService.findAll();
    }

    // http://127.0.0.1:802/api/ad/save?name=yinlz&url=http://yinlz.com
    @GetMapping("/save")
    public Mono<AdBean> save(final String name,final String url) {
        final AdBean vo = new AdBean();
        vo.setName(name);
        vo.setUrl(url);
        return adService.save(vo);
    }
}