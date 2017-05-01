package com.csz.service;

import com.csz.dao.ApiMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    private static Logger logger = LogManager.getLogger(ApiService.class);

    @Autowired
    private ApiMapper apiMapper;

    public Object health(){
        return apiMapper.health();
    }
}
