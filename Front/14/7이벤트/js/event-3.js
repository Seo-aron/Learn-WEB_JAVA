const btn = document.querySelector('button');

function changeBackground() {
    document.body.style.backgroundColor = 'green';
}

btn.onclick = changeBackground;
