package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.AdminService;
import com.oujiajie.oa.dao.AdminDao;
import com.oujiajie.oa.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 16:35
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public void add(Admin admin) {
        adminDao.insert(admin);
    }

    public void edit(Admin admin) {
        adminDao.update(admin);
    }

    public void remove(int id) {
        adminDao.delete(id);
    }

    public Admin get(int id) {
        Admin admin = adminDao.select(id);
        return admin;
    }

    public List<Admin> getAll() {
        List<Admin> admins = adminDao.selectAll();
        return admins;
    }
}
