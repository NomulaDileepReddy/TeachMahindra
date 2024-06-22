

let num = parseInt(prompt("Enter the number : "));

let fact = 1;
for(let i=1;i<=num;i++){
    fact = fact*i;
}

document.write("<h1>Factorial of given number is </h1>" + fact);