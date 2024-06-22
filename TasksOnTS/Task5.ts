

var arr : number[] = [1, 2, 3, 4, 5];

arr.push(6);

for(var i in arr){
    console.log("Array elements are " + arr[i]);
}

console.log("Popped element is " + arr.pop());

for(var i in arr){
    console.log("Array elements are " + arr[i]);
}