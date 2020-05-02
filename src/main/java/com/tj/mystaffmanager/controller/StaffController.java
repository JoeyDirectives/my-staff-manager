package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.NewsEntity;
import com.tj.mystaffmanager.entity.StaffEntity;
import com.tj.mystaffmanager.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.controller
 * @NAME: StaffController
 * @USER: GOD_T
 * @DATE: 2020/5/1
 * @TIME: 21:51
 **/
@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;

    /**
     * 获取全部员工信息
     *
     * @return 员工信息list
     */
    @GetMapping("/api/HomePage/staffInfo")
    public List<StaffEntity> getNewsInfo() {
        return staffService.getAllStaff();
    }
}
