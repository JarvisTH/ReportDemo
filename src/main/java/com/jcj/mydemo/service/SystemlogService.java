package com.jcj.mydemo.service;

import com.jcj.mydemo.domain.Systemlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface SystemlogService
{
    //保存日志
    void save(Systemlog systemlog);

    //多条件动态查询
    Page<Systemlog> queryDynamic(Map<String,Object> reqMap, Pageable pageable);
}
