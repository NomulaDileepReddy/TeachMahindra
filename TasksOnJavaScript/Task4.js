

let num = parseInt(prompt("Enter the number : "));

let new_num = num;

var count = 0;
while(new_num>0){
    count = count + 1;
    new_num = Math.floor(new_num/10);
}

let ans = 0;

let num1 = num;

while(num1>0){
    let rem = num1%10;
    ans = ans+Math.pow(rem,count);
    num1 = Math.floor(num1/10);
}

if(num==ans){
    document.write("<h3>Given number is Armstrong number</h3>");
}
else{
    document.write("<h3>Given number is not an Armstrong number</h3>");
}
