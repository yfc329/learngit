package test.IDao;

import test.domain.Score;

public interface ScoreMapper {
    int insert(Score record);

    int insertSelective(Score record);
}