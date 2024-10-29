$('.touch_right_btn').on('click', function () {
    // 현재 보여지고 있는 배너의 alt 속성 값을 가져옵니다.
    var current_banner = $('#mySwipe ul li:visible').find('img').attr('alt');

    // 현재 alt 속성 값을 숫자로 변환합니다.
    var alt_num = parseInt(current_banner, 10);

    // 다음 배너로 이동하기 위해 alt_num을 감소시킵니다.
    // 만약 alt_num이 1이면, 마지막 배너로 돌아가도록 설정합니다.
    alt_num = alt_num === 1 ? $('#mySwipe ul li').length : alt_num - 1;

    // 모든 배너를 숨기고
    $('#mySwipe ul li').hide();

    // 감소된 alt_num과 일치하는 alt 속성 값을 가진 배너를 찾아 표시합니다.
    $('#mySwipe ul li')
        .find('img[alt="' + alt_num + '"]')
        .closest('li')
        .show();

    // bullet 이미지 업데이트 (선택 사항)
    $('.touch_bullet li img').attr('src', 'images/visual_bullet_off.png'); // 모든 bullet 초기화
    $('.touch_bullet li')
        .eq(alt_num + 1)
        .find('img')
        .attr('src', 'images/visual_bullet_on.png'); // 현재 bullet 활성화
});
