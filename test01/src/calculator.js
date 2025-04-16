class joy{
    start(){
        let strInput2 = prompt("키를 입력하십시오");
            if(strInput2 < 150){
                console.log("No");
            } else if(strInput2 >= 150){
                console.log("Yes");
            }


    }
}

class Num{
    num1 = 0;
    num2 = 0;
    num3 = 0;


    num1 = parseInt(prompt("키를 입력하십시오"));
    num2 = parseInt(prompt("키를 입력하십시오"));
    num3 = parseInt(prompt("키를 입력하십시오"));
    average(){

        let d = (this.num1+this.num2+this.num3)/3;
        console.log(Math.floor(d));
    }
}




let Jo = new joy();
Jo.start();
let aver = new Num();
aver.average();
