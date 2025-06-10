package com.itheima.service.impl;

//import com.itheima.domain.Admin;
import com.itheima.mapper.AdminMapper;
import com.itheima.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    // 确保这里的 mapper 被正确注入
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public String queryByNamePwd(String aname, String apassword) {
        // 第23行可能是调用了 adminMapper 的方法
        // 例如: return adminMapper.queryByNamePwd(aname, apassword);
        return adminMapper.queryByNamePwd(aname, apassword);
    }
}
