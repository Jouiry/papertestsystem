package com.oujiajie.oa.biz;



import com.oujiajie.oa.entity.Admin;

import java.util.List;

public interface AdminService {
    void add(Admin admin);
    void edit(Admin admin);
    void remove(int id);
    Admin get(int id);
    List<Admin> getAll();
}
