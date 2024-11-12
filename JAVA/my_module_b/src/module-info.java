


//my_module_b 모듈이 라이브러리가 포함하고 있는
//두개의 pack3, pack4패캐지 내부의 클래스들을
//외부 프로젝트에서 사용할수 있도록
//모듈 기술자파일(module-info.java)에 다음과 같이 작성한다
module my_module_b {
	
	exports pack3; //외부 프로젝트에서 가져다 사용할수 있도록 허용
	exports pack4; //외부 프로젝트에서 가져다 사용할수 있도록 허용
	
}