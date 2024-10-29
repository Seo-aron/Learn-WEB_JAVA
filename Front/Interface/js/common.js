$(function () {
    $('.login_wrap a').on('click', () => {
        $('#login_f').animate({ top: '20px' }, 500);

        return false;
    });

    $('.login_wrap .login_close_btn a, input[alt="login_btn"]').on('click', () => {
        $('#login_f').animate({ top: '-500px' }, 500);

        return false;
    });

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

    var base = 100;
    var mybody = $('body');
    $('#zoom a').on('click', function () {
        var zNum = $('#zoom a').index(this);
        if (zNum === 0) {
            base += 10;
        } else if (zNum == 1) {
            base = 100;
        } else {
            base -= 10;
        }
        mybody
            .css('overflow-x', 'auto')
            .css('transform-origin', '0 0')
            .css('transform', 'sc ale(" + base/100 +")')
            .css('zoom', base + '%');

        return false;
    });

    $('.print_btn').on('click', () => {
        window.print();
        return false;
    });

    $('#keyword')
        .on('focus', function () {
            $(this).css('background-position', '0 -500px');
        })
        .on('blur', function () {
            if ($(this).val() === '') {
                $(this).css('background-position', '0 0px');
            }
        });

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

    $('form[name=rel_f]').submit(function () {
        var site = $('select', this).val();

        window.open(site);

        return false;
    });

    var defaultTop = parseInt($('#quick_menu').css('top'));

    $(window).on('scroll', function () {
        var scv = $(this).scrollTop();
        // console.log(scv);
        $('#quick_menu')
            .stop()
            .animate({ top: scv + defaultTop + 'px' });
    });
});
