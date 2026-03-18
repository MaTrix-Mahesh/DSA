let arr = [10,20,30,40,50];
let position = 2;
let newelement = 24;

for (let i = arr.length-1; i >=0 ; i--) {
    if (i>=position) {
        arr[i+1] = arr[i];
        if (i==position) {
            arr[i]= newelement;
        }
    }
}

console.log(arr);