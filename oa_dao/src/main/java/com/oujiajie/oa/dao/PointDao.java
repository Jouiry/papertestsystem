package com.oujiajie.oa.dao;

import com.oujiajie.oa.entity.Point;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By Jou
 * Date 2019/5/19 0019 Time 14:11
 */
@Repository("pointDao")
public interface PointDao {
    void insert(Point point);
    void update(Point point);
    void delete(int pointId);
    Point select(int pointId);
    List<Point> selectAll();
    List<Point> selectByChapId(int chapId);
}
