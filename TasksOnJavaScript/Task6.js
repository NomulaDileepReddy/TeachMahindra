

let n = parseInt(prompt("Enter the size of the array : "));

let str_arr = new Array(n);
for(let i=0;i<n;i++){
    str_arr[i] = prompt("Enter the strings to enter into the array : ");
}

for(let i=0;i<n;i++){
    document.write(str_arr[n-i-1] + " ");
}