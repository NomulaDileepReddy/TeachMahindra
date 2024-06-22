

let n = parseInt(prompt("Enter the size of the array : "));
let arr = new Array(n);

for(let i=0;i<n;i++){
    arr[i] = parseInt(prompt("Enter array values : "));
}

let min = arr[0];
let max = arr[0];

for(let i in arr){
    if(arr[i]<min){
        min = arr[i];
    }
    else if(max<arr[i]){
        max = arr[i];
    }
}

document.writeln("Largest number in the array is "+max);
document.writeln("Smallest number in the array is "+min);

