
/*
  주제 : null병합연산자  ?? 사용하면, 
        값이 저장(확정)된 변수를 쉽게 찾아 낼수 있다.
*/
let varA = 10; //varA변수메모리에는 10이 저장(확정)되었다.
let varB = 20; //varB변수메모리에는 20이 저장(확정)되었다.
let varC; //varC변수메모리만 선언하고 값이 저장(확정)되지 않았다.

//?? null병합연산자 사용 문법
//   피연산자  ??  피연산자2

//varA변수값 10, varB변수값은 20으로 둘다 저장(확정)되어있으므로
//이때 ?? 연산자는 연산자 기준 왼쪽 피연산자의 값을 연산결과로 반환
console.log( varA  ??  varB ); //10

//varC변수는 값을 저장(확정)하지 않아 undefiend값을 갖습니다.
//varB변수는 값 20이 저장되어 있습니다.
//이때  ?? null병합연산자는 값이 확정변수인 varB의 값은 연산 결과로 반환
console.log(  varC  ?? varB );  //20

console.log("------------------------\n");

/*
  주제2 : 실무에서 null병합연산자를 이용해서 사용하는 실습

    스토리 ->  변수 user에 해당 사용자의 이름이 저장되어 있다면?
               이름을 저장하고,  없다면 닉네임 저장하시오.
*/
// let name; //값이 저장되지 않음 
let name = "이정환"; //값이 저장되어 있음

let nickname = "winterlood";  //값이 저장되어 있음


//변수 name과 nickname 중 저장되어 있는 변수의 값을  user변수에 저장시키자
let user = name  ??  nickname; 
//  "winterlood"
//  "이정환"
console.log(user);







