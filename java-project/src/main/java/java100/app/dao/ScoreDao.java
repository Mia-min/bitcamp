package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.beans.ApplicationContext;
import java100.app.domain.Score;
import java100.app.util.DataSource;

public interface ScoreDao {

	List<Score> selectList();

	int insert(Score score);

	int update(Score score);

	int delete(int no);

	Score selectOne(int no);
}
