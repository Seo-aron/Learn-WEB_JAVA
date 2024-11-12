

//my_application_3프로젝트 내부에서
//my_module_a.jar라이브러리의 모듈과
//my_module_b.jar라이브러리의 모듈을 사용하기 위해
//의존설정이 필요하다.
module my_application_3 {
	
	         //의존주입할 외부 모듈명
	requires my_module_a;
	requires my_module_b;
}


