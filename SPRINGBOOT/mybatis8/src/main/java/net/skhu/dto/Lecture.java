package net.skhu.dto;

import lombok.Data;

//lecture 테이블의 필드에 해당하는 속성만 구현된 단순한 DTO 클래스이다.

@Data
public class Lecture {
	int id;
	String title;
	int profesorId;
	int year;
	String semester;
	String room;
}
