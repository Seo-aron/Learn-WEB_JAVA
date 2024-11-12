module my_module_a {

//my_module_a 모듈이 포함하고 있는
//두개의 pack1와 pack2패키지를
//외부 프로젝트에서 사용할수 있도록
//	모듈기술자파일(module-info.java)을
//	다음과 같이 작성한다.
	//방법
	//exports키워드는 모듈이 가지고 있는 패키지를 외부 프로젝트에서
	//사용할수 있도록 외부에 노출시키는 역할을 하기 때문에 아래와 같이 작성
		//exports 노출시킬패키지명;
	
	exports pack1;
	//exports pack2;  외부에서 사용할수 없도록 은닉화 시키자
	
	//my_moudule_b 모듈을 전이적 의존으로 설정
	requires transitive my_module_b;

}








