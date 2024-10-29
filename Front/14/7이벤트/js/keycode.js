const body = document.body;
const result = document.querySelector('#result');

body.addEventListener('keydown', (e) => {
    // document.querySelector('h1').innerText = e.type;
    // document.querySelector('h1').innerText = e.target;
    // document.querySelector('h1').innerText = e.code;
    //document.querySelector('h1').innerText = e.key;
    // document.querySelector('h1').innerText = e.ctrlKey;
    result.innerText = `
                        code : ${e.code},
                        key : ${e.key}
                        `;
});
