let arr = [10,20,30,40,50,60,70,80,90,100];
let position = 3;

for (let i = position; i <= arr.length-1; i++) {
    arr[i]=arr[i+1]
    
}
arr.length = arr.length-1
console.log(arr);


