package com.tj.mystaffmanager.serviceImpl;

import com.tj.mystaffmanager.entity.ApplicationEntity;
import com.tj.mystaffmanager.mapper.ApplicationMapper;
import com.tj.mystaffmanager.mapper.LoginMapper;
import com.tj.mystaffmanager.service.ApplicationService;
import com.tj.mystaffmanager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PACKAGE_NAME: com.tj.mystaffmanager.serviceImpl
 * @NAME: ApplicationServiceImpl
 * @USER: GOD_T
 * @DATE: 2020/2/8
 * @TIME: 13:34
 **/
@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public void newLeaveAddUndone(ApplicationEntity entity) {
        applicationMapper.newLeaveAddUndone(entity);
    }

    @Override
    public List<ApplicationEntity> getAllUndone() {
        return applicationMapper.getAllUndone();
    }

    @Override
    public void deleteSelectedById(Integer applicateId) {
        applicationMapper.deleteSelectedById(applicateId);
    }
}
