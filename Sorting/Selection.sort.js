let arr = [10,5,1,12,19]
let n = arr.length

let count =0

for (let i = 0; i < n-1; i++) {
    let minIndex = i
    for (let j = i+1; j < n; j++) {

        count++;
        
        if (arr[minIndex] > arr[j]) {
            minIndex = j
        }
        
    }
    
    let temp = arr[i]
    arr[i] = arr[minIndex]
    arr[minIndex] = temp
    
}


console.log(arr);
console.log(count);

