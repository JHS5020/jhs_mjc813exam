let leftNumber = "";
let rightNumber = "";
let operator = "";
let result = "";


    let a = [];
for(let i = 1; i <10; i++){
    let q = 3*i;
    a[i-1] = q;
}
a.forEach(function(item){
    console.log(`3 x ${item/3} = ${item}`);
});

const a1 = [36, 122, 79, 8, "무궁화", 391, "words", 509, 20192, "B", 321, 473, 73, "france", "Korea", 24, 99];

const b2 = a1.toSorted();
const b3 = b2.toSorted(function(a,b){return a - b});
console.log(b3);
const c1 = b3.reverse();
console.log(c1[0]);
const d1 = b2.filter(myFunction);
function myFunction(value, index, array) {
  return value % 2 == 0;
}
console.log(d1);
const e1 = a1.filter(myFunction1);
function myFunction1(value, index, array) {
  return value >= "A";
}

for(let i = 0; i < e1.length; i++){
    e1[i].toUpperCase();
}


console.log(e1);




function checkWhere(number) {
    if( operator === "" ) {
        leftNumber += number.toString();
    } else {
        rightNumber += number.toString();
    }
    document.getElementById("outDiv").innerText = leftNumber + " " + operator + " " + rightNumber;
}

function buttonNum(number) {
    checkWhere(number);
}

function buttonAdd() {
    operator = "+";
}

function buttonSub() {
    operator = "-";
}

function buttonMul() {
    operator = "*";
}

function buttonDiv() {
    operator = "/";
}

function buttonEqu() {
    try {
        let res = eval(leftNumber);
    } catch(ex) {
        console.log(ex.message);
        leftNumber = leftNumber.replaceAll('A','');
    }
    let a = typeof leftNumber;
    console.log(a);
    console.log(a instanceof Number);
    try {
        let res = eval(rightNumber);
    } catch(ex) {
        console.log(ex.message);
        rightNumber = rightNumber.replaceAll('A','');
    }
    switch(operator) {
        case "+":
            result = (Number(leftNumber) + Number(rightNumber)).toString();
            break;
        case "-":
            result = (Number(leftNumber) - Number(rightNumber)).toString();
            break;
        case "*":
            result = (Number(leftNumber) * Number(rightNumber)).toString();
            break;
        case "/":
            result = (Number(leftNumber) / Number(rightNumber)).toString();
            break;
    }
    document.getElementById("outDiv").innerText = leftNumber + " " + operator
        + " " + rightNumber + " = " + result;
}

function buttonCE() {
    leftNumber = "";
    rightNumber = "";
    operator = "";
    result = "0";
    document.getElementById("outDiv").innerText = result;
}

class Car1 {
	name = "";
	construct(a) {
	    this.name = a;
	}
	start() {
	    console.log(this.name + " start");
	}
}

let car1 = new Car1("Fiat");
car1.start();

function Person(first, last, age, eye) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
}

let p1 = new Person("first", "last", 20, "black");
console.log(p1);
console.log(JSON.stringify(p1));


// JavaScript 에서 클래스 선언하고 객체 탄생하는 방법으로 사용한다.
class Human {
	height = 180; // 인스턴스 변수, 멤버변수
	name = "";
	age = 0;

	constructor(name, age) {	// 비기본 생성자
		// this는 클래스가 생성할 인스턴스를 가리킨다.
		this.name = name;
		this.age = age;
	}

	print() {
		console.log("이름은 " + this.name + ", 나이는 " + this.age
		 + ", 키는 " + this.height);
	}

	start() {
	    console.log(this.name + " Start !!");
	}
}

let human1 = new Human("이순신", 30);
human1.print();
let human2 = new Human("홍길동", 25);
human2.print();
human2.start();

//class Car {
//    name = "";
//    model = "";
//    weight = "";
//    color = "";
//
//    constructor(name, m, w, color) {
//        this.name = name;
//        this.model = m;
//        this.weight = w;
//        this.color = color;
//        // this는 클래스를 설계할때는 어떤 이름으로 인스턴스될지 모른다.
//        // 인스턴스 된 자기 객체를 뜻할때 this 라는 단어를 사용한다.
//    }
//
//    start() {
//        alert(JSON.stringify(this) + " 출발합니다.");
//        // JSON 문자열 형식 {이름:값, 이름:값, ...}
//        // 생성된 객체의 멤버변수이름과 멤버변수 값을 출력한다.
//    }
//
//    drive() {
//        console.log(this.name + " 운전합니다.");
//    }
//
//    brake() {
//        console.log(this.name + " 브레이크 페달 밟아요.");
//    }
//
//    stop() {
//        console.log(this.name + " 정지합니다.");
//    }
//
//    showRedSign() {
//        console.log(this.name + " 빨간불을 봤습니다.");
//        this.brake();
//        this.stop();
//    }
//}
//
//let fiat500 = new Car();
//fiat500.name = "Fiat";  // 객체를 만든후에 멤버변수를 할당하는 방법인데
//fiat500.model = "500";  // 이 방법은 별로 추천하지 않습니다.
//fiat500.weight = "850kg";
//fiat500.color = "white";
//fiat500.start();
//fiat500.drive();
//fiat500.stop();
//
//let accentMD = new Car("Accent", "MD", "700kg", "gray");
//// 객체를 만들때 생성자로 객체를 생성하면서 멤버변수의 값을 할당하는 방법을 추천합니다.
//accentMD.start();
//accentMD.drive();
//accentMD.showRedSign();
//
//class Zeep extends Car {
//    // Car 클래스를 상속받아서 Zeep 클래스를 선언한다.
//    // Car 클래스에 존재하는 멤버변수와 멤버메소드를 모두 사용할 수 있다.
//    engine = "";
//    constructor(name, m, w, color, engine) {
//        super(name, m, w, color);
//        this.engine = engine;
//    }
//    fourWd() {
//        console.log(this.name + ", " + this.engine + " 4휠 입니다.");
//    }
//}
//
//let zeep1 = new Zeep("코란도4", "코란도", "1200kg", "brown", "120마력");
//zeep1.start();
//zeep1.drive();
//zeep1.fourWd();
//zeep1.stop();
//// 자식클래스 객체는 부모클래스의 속성(멤버변수)와 메소드(멤버메소드)를 사용할 수 있다.
//// 그리고 자식클래스의 속성과 메소드를 사용할 수 있다.
//
//
//let morning1 = new Car("모닝", "M500", "700kg", "red");
//morning1.start();
//morning1.drive();
//// morning1.fourWd();  // 에러가 발생합니다.
//// 부모클래스 객체는 부모클래스만 사용할 수 있다.
//// 부모클래스 객체는 자식클래스를 모른다.
//morning1.stop();




class Text{
    constructor(t = "Javascript strings are primitive and immutable:All string methods produce a new string without altering the original string."){
        this.text = t;
    }
    split(){
        const a = this.text.split(" ");
        console.log(a);
        for(let i = 0; i < a.length; i++){
            if(i == a.indexOf("string")){
            console.log(`a[${i}]`)
            }
        }
    }
    toupperlowercase(){
        let b = "";
        for(let i = 0; i < this.text.length; i++){
            if (this.text.charAt(i) >= 'A' && this.text.charAt(i) <= 'Z'){
                b += this.text.charAt(i).toLowerCase();
            }
            else if (this.text.charAt(i) >= 'a' && this.text.charAt(i) <= 'z') {
                        b += this.text.charAt(i).toUpperCase();

            }
            else{
                     b += this.text.charAt(i);

            }
        }

        console.log(b);
    }
    replaceAll(){
        let d = this.text.replaceAll("string","문자열");
        console.log(`${d}  \n출력완료`);
    }
}
let text1 = new Text();
text1.split();
text1.toupperlowercase();
//text1.replaceAll();

//for(let i = 1; i<=9; i+=2){
//    for(let j = 4; j <= 0; j--){
//        console.log(" ");
//    }
//    console.log("*");
//}
//let text00 = " ";
//let text11 = "*";
//    for(let i = 0; i < 5; i++){
//        let ww = text00.repeat(5 - i -1);
//        let qq = text11.repeat(2*i+1);
//        console.log(ww+qq);
//    }
//let lotto = [];
//for(let i = 0; i < 6; i++){
//    lotto.push(Math.floor(Math.random() * 45 + 1));
//}
//lotto.sort(function(a, b){return a - b});
//console.log(lotto);
//
//let strInput = prompt("구하려는 번째의 숫자를 입력하세요 1 ~ 8");
//
//const planet = new Map([
//    ["1", "수성"],
//    ["2", "금성"],
//    ["3", "지구"],
//    ["4", "화성"],
//    ["5", "목성"],
//    ["6", "토성"],
//    ["7", "천왕성"],
//    ["8", "해왕성"],
//]);
//let numb = planet.get(strInput);
//console.log(numb);
//
////거꾸로
////로꾸꺼
//let strInput1 = prompt("문장을 입력하세요");
//let strr = "";
//for(let i = 1; i < strInput1.length + 1; i++){
//    strr += strInput1.charAt(strInput1.length - i);
//}
//console.log(strr);

class Wizard{
    health = "";
    mana = "";
    armor = "";

    constructor(health, mana, armor){
        this.health = health;
        this.mana = mana;
        this.armor = armor;
    }
    attack(){
        console.log("파이어볼");
    }
}
const x = new Wizard(545,210,10);
console.log(x.health, x.mana, x.armor);
x.attack();