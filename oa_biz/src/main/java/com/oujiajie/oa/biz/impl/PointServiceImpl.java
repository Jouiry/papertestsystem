package com.oujiajie.oa.biz.impl;

import com.oujiajie.oa.biz.PointService;
import com.oujiajie.oa.dao.PointDao;
import com.oujiajie.oa.entity.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/20 0020 Time 18:32
 */
@Service("pointService")
public class PointServiceImpl implements PointService {

    @Autowired
    private PointDao pointDao;

    public void add(Point point) {
        pointDao.insert(point);
        System.out.println("添加成功！");
    }

    public void edit(Point point) {
        pointDao.update(point);
        System.out.println("修改成功！");
    }

    public void remove(int id) {
        pointDao.delete(id);
    }

    public Point get(int id) {
        Point point = pointDao.select(id);
        return point;
    }

    public List<Point> selectByChapId(int chapId) {
        List<Point> points = pointDao.selectByChapId(chapId);
        return points;
    }

    public List<Point> getAll() {
        List<Point> points = pointDao.selectAll();
        return points;
    }
}
