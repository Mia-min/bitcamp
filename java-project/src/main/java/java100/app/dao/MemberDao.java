package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.beans.ApplicationContext;
import java100.app.domain.Member;
import java100.app.util.DataSource;

public interface MemberDao {
	List<Member> selectList();

	public int insert(Member member);

	public int update(Member member);

	public int delete(int no);

	public Member selectOne(int no);
}
