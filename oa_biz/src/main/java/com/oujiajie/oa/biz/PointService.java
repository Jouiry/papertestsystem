package com.oujiajie.oa.biz;

import com.oujiajie.oa.entity.Point;

import java.util.List;

public interface PointService {
    void add(Point point);
    void edit(Point point);
    void remove(int id);
    Point get(int id);
    List<Point> selectByChapId(int chapId);
    List<Point> getAll();
}
