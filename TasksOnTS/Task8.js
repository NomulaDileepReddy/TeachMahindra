function combine(flag, num) {
    return flag ? num : num > 0;
}
var result1 = combine(true, 42);
console.log("The result of combine(true, 42) is: ".concat(result1, " and its type is: ").concat(typeof result1));
var result2 = combine(false, 42);
console.log("The result of combine(false, 42) is: ".concat(result2, " and its type is: ").concat(typeof result2));
var result3 = combine(false, 0);
console.log("The result of combine(false, 0) is: ".concat(result3, " and its type is: ").concat(typeof result3));
