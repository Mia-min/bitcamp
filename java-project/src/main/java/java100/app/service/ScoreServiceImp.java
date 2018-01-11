package java100.app.service;

import java.util.List;
import java.util.Map;

import java100.app.domain.Score;

public interface ScoreServiceImp {
	List<Score> list(int pageNo, int pageSize, Map<String, Object> option);
	Score get(int no);
	int add(Score score);
	int update(Score score);
	int del(int no); 
}
