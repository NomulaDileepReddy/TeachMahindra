function combine(flag: boolean, num: number): boolean | number {
    return flag ? num : num > 0;
}


let result1: boolean | number = combine(true, 42);
console.log(`The result of combine(true, 42) is: ${result1} and its type is: ${typeof result1}`);

let result2: boolean | number = combine(false, 42);
console.log(`The result of combine(false, 42) is: ${result2} and its type is: ${typeof result2}`);

let result3: boolean | number = combine(false, 0);
console.log(`The result of combine(false, 0) is: ${result3} and its type is: ${typeof result3}`);