package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.ApplicationEntity;
import com.tj.mystaffmanager.entity.ScheduleEntity;
import com.tj.mystaffmanager.entity.UserEntity;
import com.tj.mystaffmanager.service.ApplicationService;
import com.tj.mystaffmanager.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    /**
     * 申请成功，添加至未完成表
     *
     * @param entity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/ApplicationPortal/leave")
    public String validateLoginInfo(@RequestBody ApplicationEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            applicationService.newLeaveAddUndone(entity);
            return "200";
        }
    }

    /**
     * 查询未完成列表
     *
     * @return 未完成列表
     */
    @GetMapping("/api/ApplicationPortal/undoneList")
    public List<ApplicationEntity> getUndoneInfo() {
        return applicationService.getAllUndone();
    }

    /**
     * 获取登录用户信息
     *
     * @return 登录用户info
     */
    @GetMapping("/api/ApplicationPortal/deleteUndoneList")
    public String deleteInfo(@RequestParam("applicateId") Integer applicateId) {
        if (applicateId == null){
            return "400";
        }else {
            applicationService.deleteSelectedById(applicateId);
            return "200";
        }
    }
}
