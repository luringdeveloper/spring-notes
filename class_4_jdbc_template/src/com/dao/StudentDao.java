package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.model.Student;

public class StudentDao {

	public int insert(Student student) {
		return Dao.getJdbcTemplate().update("insert into student values(?,?)",new Object[] {
				 student.getRoll(),student.getName()
		 }); 
	}

	public int delete(Integer roll) {
		return Dao.getJdbcTemplate().update("delete from student where roll=?",new Object[] {
				 roll  
		 }); 

	}

	public int update(Student student) {
		return Dao.getJdbcTemplate().update("update student set name=?",new Object[] {
				 student.getName(),student.getRoll()
		 }); 
 
	}

	public Student fetchByRoll (Integer roll) {
		return Dao.getJdbcTemplate().query("select * from student where roll=?", new StudentMapper(),new Object[] {roll}).get(0);
	}

	public List<Student> fetchAll( ) {
		return Dao.getJdbcTemplate().query("select * from student where roll=?", new StudentMapper());
	}
	
	class   StudentMapper  implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student =new Student();
			student.setRoll(rs.getInt(1));
			student.setName(rs.getString(2));
			return student;
		}
		
	}

}
