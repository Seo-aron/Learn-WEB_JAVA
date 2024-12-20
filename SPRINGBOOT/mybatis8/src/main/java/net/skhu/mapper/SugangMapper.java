package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Sugang;

@Mapper
public interface SugangMapper {

	//한 학생이 수강한 정보를 sugang테이블의 모든열값과,
	//                   student테이블의 studentNo열, name열,
	//				그리고 lecture테이블의 title열, year열, semester열 값
	//JOIN해서 조회

	 /*
	@ResultMap("findAll")
	  SugangMapper.xml 파일의 id="findAll" resultMap 방법으로
	  조회 결과를 DTO 객체에 채워서 리턴하라는 설정이다.
	*/
	@ResultMap("findAll")
	@Select("""
			SELECT g.*, s.studentNo, s.name, l.title, l.year, l.semester
			FROM sugang g
			JOIN student s ON g.studentId = s.id
			JOIN lecture l ON g.lectureId = l.id
			ORDER BY s.studentNo
			""")
	List<Sugang> findAll();
}











