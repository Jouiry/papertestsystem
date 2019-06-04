package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("adminDao")
public interface AdminDao {
    void insert(Admin admin);
    void update(Admin admin);
    void delete(int adminId);
    Admin select(int adminId);
    List<Admin> selectAll();
}
