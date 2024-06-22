
let num = parseInt(prompt("Enter the number : "));

if(num==1){
    document.write("<h1>Number is neither prime nor composite....<h1>");
}
else{
    var flag = 0;
    for(let i=2;i<num;i++){
        if(num%i==0){
            flag = 1;
        }
    }
    if(flag==0){
        document.write("<h1>Given number is a prime number.</h1>");
    }else{
        document.write("<h1>Given number is not a prime number.</h1>");
    }
}
