package com.tj.mystaffmanager.mapper;

import com.tj.mystaffmanager.entity.ApplicationEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.mapper
 * @NAME: ApplicationMapper
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:28
 **/
@Repository
public interface ApplicationMapper {
    /**
     * 新申请添加至未完成表
     *
     * @param entity 申请内容
     */
    void newLeaveAddUndone(ApplicationEntity entity);

    /**
     * 查询未完成表
     *
     * @return 未完成列表
     */
    List<ApplicationEntity> getAllUndone();

    /**
     * 根据申请id删除
     * @param applicateId 申请号
     */
    void deleteSelectedById(@Param("applicateId") Integer applicateId);
}
