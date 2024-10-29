/*
콘텐츠 영역 개발하기
-콘텐츠 영역은 크게 
  비주얼배너, 
  알림판, 
  최근게시물, 
  알림배너, 
  베스트Book, 
  페이스북,
  마케팅, 
  온라인서점
 으로 나뉩니다.
 
-레이아웃은 비주얼 배너가 들어가는 visual영역과
  나머지 주제 소스들이 들어가는 content영역으로 나뉘었음.  
*/

//-----------------------------------------------------------
/*
 주제 : 비주얼 배너 터치 슬라이드 만들기
 비주얼 배너 영역은 배너 중 한개만 노출되어 이루어져 있으며,
 [이전/다음]버튼을 누르면 배너가 이동되어 바뀌게 됨.
 스마트폰에서는 손가락으로 터치 했을때 도 배너가 바뀔수 있도록 제작 하자
 */
$(function () {
    //-----------------------------------------------------------
    /*
   주제 : 자동 롤링 배너와 제어 버튼을 활용한 알림판 만들기
  
   알림판은 일정 시간 간격으로 자동으로 배너 이미지가 바뀌면서 해당하는 배너에 버튼이 활성화 됨.
   이때 버튼을 마우스로 클릭하면 버트넹 해당하는 배너로 이동 됨.
   그리고 정지 ■ 버튼을 누르면 자동으로 넘어가던 배너가 정지되거, 재상 ▶ 버튼을 누르면 다시 배너가 넘어가게 됨 
   */
    //-----------------------------------------------------------
    /*
   주제 : 탭 메뉴를 이용해 최근 게시물 리스트 만들기
  
  - 탭메뉴의 경우 최초 탭버튼인[공지사항]이 활성화되어 보입니다.
        만일 방문자가 [질문과답변]탭을 클릭했을 때는 [공지사항]은 숨겨져야 하고,
    [질문과 답변]의 내용은 활성화되어 보여야 합니다.
    
  - 먼저 탭버튼에 <a>에 on()메서드를 사용하여 mouseover,focus,click이벤트를 등록하였고,
        이벤트 핸들러에는 이벤트가 발생 했을때 마우스를 올린 탭 버튼과 탭에 해당하는 게시물 목록이 활성화되어 보이도록 만들자. 
   */
    //-----------------------------------------------------------
    /*  
    주제 : 자동 슬라이드 배너 를 이용한 베스트 Book영역   
      https://bxslider.com/ 접속하여 사용법 보기 
    */

    var mySlider = $('#best_bg ul').bxSlider({
        // 슬라이드 이동 방향
        mode: 'horizontal',
        // 슬라이드 자동전환
        auto: true,
        // 슬라이드 전환 속도
        speed: 1000,
        // 슬라이드 너비값
        slideWidth: 200,
        // 슬라이드 넘기는 수 설정
        moveSlide: 1,
        // 최소로 노출할 슬라이드 수
        minSlides: 1,
        // 최대로 노출할 슬라이드 수
        maxSlides: 4,
        // 슬라이드 간격
        slideMargin: 30,
        // 재생, 정지 버튼 노출 여부
        autoControls: true,
        // 마우스 오버시 자동 정지 여부
        autoHover: true,
        // 불릿 버튼 노출 여부
        pager: true,
        // 화살표 버튼 노출 여부
        controls: true,
    });
    $('.prev_btn').on('click', function () {
        mySlider.goToPrevSlide();
        return false;
    });
    $('.next_btn').on('click', function () {
        mySlider.goToNextSlide();
        return false;
    });
    //-----------------------------------------------------------
    /*  
  주제 : 제이쿼리 UI플러그인과 쿠키 플러그인 사용 하기
  - 팝업창을 드래그 하여 이동시키여면, 제이쿼리 UI플러그인을 사용함.
  - [하루동안 이창 열지 않기]버튼 기능을 하용하기 위해서는 쿠키 플러그인을 사용함
  
  참고 : 쿠키 플러그인 사용법
  	       
  	    <쿠키를 생성 하는 기본 사용법>
  	  	 $.cookie("쿠키명","쿠키값",{expires:만료일});
  	  	 설명 : 쿠키명은 나중에 저장된 쿠키의 값을 불러올때 구분하기 위한 이름임.
  	  	           생성된 쿠키는 현재 부터 며칠동안 클라이언트 컴퓨터의 웹브라우저에 보관할건지 만료일(expires)을 지정할수 있음.

			예)
	 	     $.cookie("pop","no",1);
	 	         설명: 브라우저에는 "pop"라는 이름으로 "no"라는 값이 1일 동안 쿠키가 보관 됩니다.
 	         
 	    <쿠키 플러그인을 이용하여  브라우저에 저장된 쿠키를 불러오는 기본 사용법>
 	    $.cookie("쿠키명");
 	    
	 	       저장된 쿠키값인 "no" 불러오는 방법의 예)
	 	    $.cookie("pop");
 	    
 	    <쿠키 플러그인을 이용하여 브라우저에 저장된 쿠키를 삭제하는 기본 사용법>
 	    $.cookie("쿠키명",null);
 	    
	 	    "pop"에 저장된 쿠키값 삭제의 예)
 	         $.cookie("pop",null);
  */
    if ($.cookie('pop') != 'no') {
        $('#pop_wrap').show();
    }
    $('#pop_wrap').css('cursor', 'move').draggable();

    $('#pop_wrap area:eq(0)').on('click', function () {
        $('#pop_wrap').fadeOut('slow');

        return false;
    });

    $('#pop_wrap area:eq(1)').on('click', function () {
        $.cookie('pop', 'no', { expires: 1 });
        $('#pop_wrap').fadeOut('slow');

        return false;
    });
});

//https://github.com/bradbirdsall/Swipe