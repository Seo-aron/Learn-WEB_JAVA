const select_Menu = document.querySelector('#major');

function displaySelect() {
    // 현재 선택된 옵션요소의 인덱스 위치 번호 반환 후 텍스트 노드 가져옴
    let selected_Menu = select_Menu.options[select_Menu.selectedIndex].innerText;
}

select_Menu.onchange = displaySelect;
