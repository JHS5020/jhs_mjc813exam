//문제 19 제곱승 구하기
class Xx{

    num1 = parseInt(prompt("a"));
    num2 = parseInt(prompt("b"));

    start(){
        let c = this.num1 ** this.num2;
        console.log(`${this.num1}의 ${this.num2} 제곱승은 = ${c} 입니다.`);
    }
}



//원의 넓이 구하기
class Circle{
    num1 = parseInt(prompt("반지름의 길이"));

    start(){
        let result = (this.num1 ** 2) * 3.14
        console.log(`원의 넓이는 ${this.num1}*${this.num1}*3.14 = ${result} 입니다.`);
    }
}

//행성구하기2
class Eplanet2{

    start(){
        let strInput4 = prompt("영어 이름을 알고싶은 행성을 한글로 입력하세요");
        const planet2 = new Map([
            ["수성", "Mercury"],
            ["금성", "Venus"],
            ["지구", "Earth"],
            ["화성", "Mars"],
            ["목성", "Jupiter"],
            ["토성", "Saturn"],
            ["천왕성", "Uranus"],
            ["해왕성", "Neptune"],
        ]);
        let numb2 = planet2.get(strInput4);
        console.log(`입력한 "${strInput4}"의 영어 이름은 "${numb2}" 입니다.`);
    }
}

//19번
let a = new Xx();
a.start();

//25번
let b = new Circle();
b.start();

//26번
let c = new Eplanet2();
c.start();

