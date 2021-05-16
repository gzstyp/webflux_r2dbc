package com.fwtai.r2dbc.dao.repository;

import com.fwtai.r2dbc.dao.bean.AdBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AdRepository extends ReactiveCrudRepository<AdBean,Integer> {}