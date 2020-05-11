package com.tj.mystaffmanager.controller;

import com.tj.mystaffmanager.entity.ApplicationEntity;
import com.tj.mystaffmanager.entity.LeaveApproveEntity;
import com.tj.mystaffmanager.service.ApplicationService;
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
     * 删除未完成表对应索引数据
     *
     * @return 申请号
     */
    @GetMapping("/api/ApplicationPortal/deleteUndoneList")
    public String deleteInfo(@RequestParam("applicateId") Integer applicateId) {
        if (applicateId == null) {
            return "400";
        } else {
            applicationService.deleteSelectedById(applicateId);
            return "200";
        }
    }

    /**
     * 申请成功，添加至未完成表
     *
     * @param entity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/ExamineAndApprove/leaveList")
    public String addLeaveList(@RequestBody LeaveApproveEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            applicationService.insertIntoApprove(entity);
            return "200";
        }
    }

    /**
     * 查询未完成列表
     *
     * @return 未完成列表
     */
    @GetMapping("/api/ExamineAndApprove/getleaveList")
    public List<LeaveApproveEntity> getApproveInfo() {
        return applicationService.getApproveLeaveLists();
    }

    /**
     * 删除未完成表对应索引数据
     *
     * @return 申请号
     */
    @GetMapping("/api/ApplicationPortal/deleteLeaveList")
    public String deleteLeaveList(@RequestParam("applicateDate") String applicateDate) {
        if (applicateDate == null) {
            return "400";
        } else {
            applicationService.deleteByDate(applicateDate);
            return "200";
        }
    }

    /**
     * 同意或驳回请假审批(删除该审批)
     *
     * @return 审批id
     */
    @GetMapping("/api/ExamineAndApprove/deleteLeaveApprove")
    public String deleteLeaveApproveById(@RequestParam("approveId") Integer approveId) {
        if (approveId == null) {
            return "400";
        } else {
            applicationService.deleteLeaveApproveById(approveId);
            return "200";
        }
    }

    /**
     * 同意或驳回请假审批后，添加到已完成申请表中
     *
     * @param entity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/ExamineAndApprove/addDone")
    public String insertIntoDone(@RequestBody ApplicationEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            applicationService.insertIntoDone(entity);
            return "200";
        }
    }

    /**
     * 查询未完成列表
     *
     * @return 未完成列表
     */
    @GetMapping("/api/ApplicationPortal/doneList")
    public List<ApplicationEntity> getDoneInfo() {
        return applicationService.getAllDone();
    }

    /**
     * 删除未完成表对应索引数据
     *
     * @return 申请号
     */
    @GetMapping("/api/ExamineAndApprove/deleteUndone")
    public String deleteByApplicateDate(@RequestParam("applicateDate") String applicateDate) {
        if (applicateDate == null) {
            return "400";
        } else {
            applicationService.deleteByApplicateDate(applicateDate);
            return "200";
        }
    }

    /**
     * 同意或驳回请假审批后，添加到已完成申请表中
     *
     * @param entity 前端参数
     * @return 状态码
     */
    @PostMapping("/api/ExamineAndApprove/addApproveDone")
    public String insertIntoApproveDone(@RequestBody LeaveApproveEntity entity) {
        if (entity == null) {
            return "400";
        } else {
            applicationService.insertIntoApproveDone(entity);
            return "200";
        }
    }

    /**
     * 查询未完成列表
     *
     * @return 未完成列表
     */
    @GetMapping("/api/ExamineAndApprove/getApproveDone")
    public List<LeaveApproveEntity> getApproveLeaveDone() {
        return applicationService.getApproveLeaveDone();
    }
}
