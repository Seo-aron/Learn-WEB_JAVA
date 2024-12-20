package net.skhu.dto;

import lombok.Data;

//한 학생이 수강한 정보를 저장할 DTO

@Data
public class Sugang {
//sugang테이블 필드에 해당하는 속성  6개
	int id;
	int lectureId;
	int studentId;
	boolean repeated; //재수강 여부
	boolean cancel;   //수강신청 취소 여부
	String grade;

//	sugang 테이블을 조회할 때,
//	강좌 정보, 학생 정보도 같이 조회해야 하기 때문에
//	Sugang DTO 클래스에 Lecture, Student 객체 속성을 추가하였다.
	Student student;
	Lecture lecture;

}







