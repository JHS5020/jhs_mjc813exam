class joy{
    start(){
        let strInput2 = prompt("키를 입력하십시오");
            if(strInput2 < 150){
                console.log("No");
            }
            else if(strInput2 >= 150){
                console.log("Yes");
            }
            else{
                console.log("");
            }

    }
}

class Num{
    num1 = 0;
    num2 = 0;
    num3 = 0;

    constructor(num1, num2, num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    average(){
        let d = (this.num1+this.num2+this.num3)/3;

        console.log(Math.floor(d));
    }
}




let Jo = new joy();
Jo.start();
let aver = new Num(20,35,46);
aver.average();
