package test.IDao;

import test.domain.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}