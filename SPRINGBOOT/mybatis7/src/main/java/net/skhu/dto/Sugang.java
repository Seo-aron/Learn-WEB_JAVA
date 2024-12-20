package net.skhu.dto;

import lombok.Data;

//한 학생이 수강한 정보를 저장할 DTO

@Data
public class Sugang {
//sugang테이블 필드에 해당하는 속성  6개
	int id;
	int lectureId;
	int studentId;
//	sugang 테이블의 repeated 필드, cancel 필드의 DB 타입은 TINYINT 이지만
//	이 값을 Java에서 boolean 타입으로 조회할 수 있다.
	boolean repeated; //재수강 여부
	boolean cancel;   //수강신청 취소 여부

	String grade;

//  student,   lecture 테이블 필드에 해당하는 속성  5개
	String studentNo;
	String name;

	String title;
	int year;
	String semester;

}







