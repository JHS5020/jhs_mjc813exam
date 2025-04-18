class Exam41{
    number1 = 0;

    constructor(input){
        this.number1 = Number(input);
    }
    start(){
        for(let i = 2; i < this.number1 - 1; i++){
            if(this.number1 % i == 0){
                console.log(`No`);
                return
            }
        }
        console.log(`Yes`);
    }
}
let a = new Exam41(prompt("숫자를 입력하세요."));
a.start();