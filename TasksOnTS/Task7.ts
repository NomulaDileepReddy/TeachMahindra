let result: string | number;


function logType(value: string | number | boolean): void {
    console.log(`The type of the argument is: ${typeof value}`);
}

logType("Dileep Reddy");
logType(143);
logType(true);