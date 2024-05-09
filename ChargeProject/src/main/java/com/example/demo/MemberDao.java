package com.example.demo;
import java.time.LocalDateTime;
import java.util.List;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    private JdbcTemplate jdbcTemplate;

    public MemberDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Member> selectAll() {
    	List<Member> results = jdbcTemplate.query("select * from user",
    	(ResultSet rs, int rowNum) -> {
    	Member member = new Member(rs.getString("ID"), rs.getString("Password"),rs.getString("Name"), rs.getString("Phone"),rs.getString("Business"),rs.getString("car"),rs.getString("Date"));

    	member.setId(rs.getString("ID"));
    	member.setPassword(rs.getString("Password"));
    	member.setName(rs.getString("Name"));
    	member.setPhone(rs.getString("Phone"));
    	member.setBuisnessman(rs.getString("Business"));
    	member.setCar(rs.getString("Car"));
    	member.setBirth(rs.getString("Date"));
    	
    	return member;
    	});
    	return results;
    	}
    
    
    public void InsertMember(Object[] params) {	
    	String sql = "INSERT INTO user(ID, Password, Name, Date, Phone, Business, Car) VALUES(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, params);
    }
    

}

