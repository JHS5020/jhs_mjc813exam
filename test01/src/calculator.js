for(let i = 1; i<=9; i+=2){
    for(let j = 4; j <= 0; j--){
        console.log(" ");
    }
    console.log("*");
}
let text00 = " ";
let text11 = "*";
    for(let i = 0; i < 5; i++){
        let ww = text00.repeat(5 - i -1);
        let qq = text11.repeat(2*i+1);
        console.log(ww+qq);
    }
let lotto = [];
for(let i = 0; i < 6; i++){
    lotto.push(Math.floor(Math.random() * 45 + 1));
}
lotto.sort(function(a, b){return a - b});
console.log(lotto);

let strInput = prompt("구하려는 번째의 숫자를 입력하세요 1 ~ 8");

const planet = new Map([
    ["1", "수성"],
    ["2", "금성"],
    ["3", "지구"],
    ["4", "화성"],
    ["5", "목성"],
    ["6", "토성"],
    ["7", "천왕성"],
    ["8", "해왕성"],
]);
let numb = planet.get(strInput);
console.log(numb);

//거꾸로
//로꾸꺼
let strInput1 = prompt("문장을 입력하세요");
let strr = "";
for(let i = 1; i < strInput1.length + 1; i++){
    strr += strInput1.charAt(strInput1.length - i);
}
console.log(strr);

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