$(function () {
    /*
 주제 : Show & Hide 로그인폼 만들기
 
 - 화면상단에 [로그인]버튼을 눌렀을때, 화면 상단 바깥에 숨겨져 있던
 로그인 폼이 위에서 내려와 화면에 나타나도록 만들자.

 -그리고 로그인 폼에 [close(닫기)]버튼을 눌렀을때는 
 폼이 다시 화면 상단 바깥으로 이동되어 숨겨지도록 만들자.
 
 -또한 로그인 폼의 아이디 및 비밀번호 입력 요소에 안내가이드도 만들자
*/
    //로그인 폼 열기
    $('.login_wrap a').on('click', () => {
        $('#login_f').animate({ top: '20px' }, 500);

        return false;
    });
    // 로그인 폼 닫기 (닫기버튼, 로그인버튼 클릭 시)
    $('.login_wrap .login_close_btn a, input[alt="로그인버튼"]').on('click', () => {
        $('#login_f').animate({ top: '-500px' }, 500);

        return false;
    });
    // 아이디, 비밀번호 입력 칸 글자 숨기기, 다시 보이게하기
    // $('#user_id, #user_pw').on('focus', function () {
    //     $(this).prev().css('left', '-9999px');
    // });
    // $('#user_id, #user_pw').on('blur', function () {
    //     if ($(this).val() === '') {
    //         $(this).prev().css('left', '2px');
    //     }
    // });
    $('#user_id, #user_pw').on({
        focus: function () {
            $(this).prev().css('left', '-9999px');
        },
        blur: function () {
            if ($(this).val() === '') {
                $(this).prev().css('left', '2px');
            }
        },
    });

    //-----------------------------------------------------------------------------------------------------

    /*
    주제 :  ZOOM 버튼 만들기
    [+]를 클릭하면 화면이 확대 되고,
    [-]를 클릭하면 화면이 축소 됩니다.
    그리고 [100]을 눌렀을때는 원래 100%사이즈로 되돌리도록 만들기
    
    참고 : zoom 버튼을 클릭 했을때 화면 확대/축소를 적용하기 위해서는 
        CSS속성중에 zoom속성과 transform의 scale속성 사용법을 잘 알고 있어야 합니다.
        
        이때 웹브라우저 마다 CSS속성이 모두 정상적으로 작동하지 않으므로 구분해서 사용 해야 하는데,
        zoom속성의 경우에는 현재 파이어폭스를 제외한 모든 브라우저에서 지원하고 있습니다.
        
        그리고 transform의 scale속성은 현재 IE8 이하를 제외한 모든 브라우저에서 지원 하고 있습니다.
    
        1.제이쿼리의 zoom속성 사용법
          문법-> $(요소선택).css("zoom", "확대비율%");
          
          예-> $("body").css("zoom","200%");
            //<body>영역의 모든 태그요소가 2배로 확대 됩니다.
        
        2.제이쿼리의 transform의 scale속성 사용법	 	
          문법-> $(요소선택).css("transform","scale(확대비율)")
          
          예-> $("body").css("transform","scale(2)")
            //화면에서 <body>영역의 모든 태그요소가 2배로 확대 됩니다.
            
          참고 :  	 transform의 scale속성을 이용해 보면 확대 기준점이 가운데로 지정되어 있어
                  사방으로 퍼져 확대됨.
                  확대 기준점을 바꾸고 싶으면 CSS에 transform-origin속성을 사용 하면됨.
        
        3.제이쿼리의 transform-origin속성 사용법
          문법-> $(요소선택).css("transform-origin","x축 위칫값 y축 위칫값")
          
          예-> $("body").css("transform-origin","0 0");
            //<body>영역의 확대 기준점이 "0 0" 으로 설정되어  
            //(0,0)위치에서 x축 과 y축 방향으로 확대됨
    
    */
    var base = 100;
    var mybody = $('body');
    $('#zoom a').on('click', function () {
        var zNum = $('#zoom a').index(this);
        if (zNum === 0) {
            // + 버튼
            base += 10;
        } else if (zNum == 1) {
            // 100% 버튼
            base = 100;
        } else {
            // - 버튼
            base -= 10;
        }
        mybody
            .css('overflow-x', 'auto')
            .css('transform-origin', '0 0')
            .css('transform', 'sc ale(" + base/100 +")')
            .css('zoom', base + '%');

        return false;
    });

    //-----------------------------------------------------------------------------------------------------

    /*
   	주제 : 인쇄 버튼 만들기 
   	인쇄 버튼 웹사이트에서 인쇄 버튼을 방문자가 눌렀을대.. 인쇄창을 뛰우는 방법을 알아 봅시다.
   */
    $('.print_btn').on('click', () => {
        window.print();
        return false;
    });

    //-----------------------------------------------------------------------------------------------------

    /*
   주제 : 검색 창 안내 가이드 만들기
   검색 입력 요소에 마우스로 클릭해 포커스가 이동되면 
   안내 가이드 변경 이미지가 사라지고,
   포커스가 다른 요소로 이동되었을때 검색 입력 요소에 아무 내용이 없으면
   다시 안내가이드 배경 이미지가 다시 나타나게 하기 
   */
    /*검색 창 안내 가이드*/
    $('#keyword')
        .on('focus', function () {
            $(this).css('background-position', '0 -500px');
        })
        .on('blur', function () {
            if ($(this).val() === '') {
                $(this).css('background-position', '0 0px');
            }
        });

    //-----------------------------------------------------------------------------------------------------

    /*
    주제 : GNB(글로벌 네비게이션 바) 메뉴 만들기
    사이트의 모든 페이지에 노출되는 메뉴를 가리키며,
    보통 사이트 상단에 위치합니다.
    GNB상위 메뉴에 마우스가 올라갔을때, 해당 상위 메뉴 이미지는 활성화(컬러)된 이미지로 바뀌게 됨.
    이어서 마우스를 다른 상위메뉴로 이동하면,
    앞서 활성화된 상위 메뉴 이미지는 다시 비활성화(무채도)된 이미지로 바뀌고,
    현재 마우스가 올라간 상위 메뉴의 이미지는 활성화된 이미지로 바뀌도록 만들자 
    */
    /*GNB 메뉴*/
    var beforeE1;
    $('#gnb li a').on('mouseover', function () {
        var imSrc = $('img', this).attr('src');
        var newSrc = imSrc.replace('out.gif', 'over.gif');
        $('img', this).attr('src', newSrc);

        $(this).next().stop().slideDown('normal');

        beforeE1 = $(this);
    });

    $('#gnb li').on('mouseleave', function () {
        $('#gnb ul:visible').slideUp('fast');
        if (beforeE1) {
            var imSrc = $('img', this).attr('src');
            var returnSrc = imSrc.replace('over.gif', 'out.gif');
            $('img', this).attr('src', returnSrc);
        }
    });

    //-----------------------------------------------------------------------------------------------------
    /*
   주제: 슬라이드 전체 메뉴 만들기
   - 전체 메뉴를 클릭 했을 때 전체메뉴가 slide효과로 펼쳐지고
     전체 메뉴 버튼 이미지도 바뀌도록 만들어 보자
   - [전체메뉴]버튼을 클릭 했을때 전체 메뉴가 아래로 펼쳐지며
     [CLOSE]버튼을 클릭했을때는 다시 전체메뉴가 위로 접히면서 사라지게 해보자.  
   */
    $('#total_btn a').click(function () {
        $('#total_menu').slideToggle('normal');

        if ($('img', this).attr('src') === 'images/allmenu_btn_out.gif') {
            $('img', this).attr('src', $('img', this).attr('src').replace('out.gif', 'over.gif'));
        } else {
            $(this).children('img').attr('src', 'images/allmenu_btn_out.gif');
        }
        return false;
    });

    $('#total_close').click(function (event) {
        event.preventDefault(); // = (맨 윗줄에 쓰는) return false;
        $('#total_menu').slideUp(500);
        $('#total_btn a img').attr('src', 'images/allmenu_btn_out.gif');
    });
    //-----------------------------------------------------------------------------------------------------

    /*
    주제 :  현재 날짜 표기 하기
    사이트 헤더 영역에  현재 연도, 월, 일을 표기 합니다.
    Date객체를 사용하여 오늘의 날짜 정보를 구해 올것입니다.
    */

    /*날짜 표기*/
    var date = new Date();
    var initalTime = date.getTime();
    var elapsedTime = 0;

    setInterval(function () {
        elapsedTime += 1000;
        date.setTime(initalTime + elapsedTime);

        $('#date_wrap span:eq(0)').text(date.getFullYear());
        $('#date_wrap span:eq(1)').text(date.getMonth() + 1);
        $('#date_wrap span:eq(2)').text(date.getDate());
        $('#date_wrap span:eq(3)').text(date.getHours());
        $('#date_wrap span:eq(4)').text(date.getMinutes());
        $('#date_wrap span:eq(5)').text(date.getSeconds());
    }, 1000);
    /*
    initalTime에 date.getTime()으로 현재 시간을 얻어온 뒤
    date객체에 setTime(현재시간 + 경과시간)을 설정을 해서 date객체에 저장해둠
    date객체를 getTime()으로 얻어오면 date객체에 저장해둔 현재시간 + 경과시간이 나타남
    */

    //-----------------------------------------------------------------------------------------------------

    /*
    주제 : 관련 사이트 이동 선택 상자 만들기
    -푸터 영역에는 관련 사이트 이동 선택 상자가 있습니다.
      사이트에 방문객체 관련 사이트를 선택한 후 [이동]버튼을 클릭하였을 때 새창으로 선택한 사이트가 열리도록 할것입니다.
      여기서는 [이동] 버튼을 클릭했을때 <form>태그에서 전송이 일어나므로 submit 이벤트를 적용 하겠습니다.
      이벤트가 발생 했을 때 이벤트 핸들러에 window.open(사이트 경로)메서드를 이용해 새창 으로 지정한 사이트가 열리도록 만들것입니다.  
    */
    $('form[name=rel_f]').submit(function () {
        var site = $('select', this).val();

        window.open(site);

        return false;
    });

    //-----------------------------------------------------------------------------------------------------

    /*옆쪽 퀵 메뉴*/
    /*
  	클라이언트가 index.html사이트를 웹브라우저로 처음 요청했을떄
  	퀵 메뉴 영역인 <div id="quick_menu"></div>요소영역의 CSS설정 top속성의 위치 이동값 100을 구하기 위해
  	퀵 메뉴 영역을  선택해서 가져와  css("top")메소드를 호출하면
  	미리 설정되어 있는 top 속성값 "100px" 문자열을 얻는다.
  	"100px" top속성의 값을 나중에 스크롤막대바가 세로로 이동한 거릿값과 + 계산하기 위해 
  	100정수만 추출해서 얻어낸다.
    
    요약 : div에 css문법으로 설정된 기본전체 문서 상단에서 퀵 메뉴영역(div)이 위치한 top속성값 !
    	  퀵 메뉴가 아래로 위치한 top속성값 얻기 
  */
    // console.log($('#quick_menu').css('top'));
    var defaultTop = parseInt($('#quick_menu').css('top'));

    $(window).on('scroll', function () {
        var scv = $(this).scrollTop();
        // console.log(scv);
        $('#quick_menu')
            .stop()
            .animate({ top: scv + defaultTop + 'px' });
    });
});
