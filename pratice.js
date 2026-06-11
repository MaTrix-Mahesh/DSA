let arr = [10,5,1,19,12];
let n = arr.length
let count = 0 
for (let i = 0; i < n-1; i++) {
   let minindex = i
   for (let j = i+1; j <n; j++) {
      count++;
      if (arr[minindex] > arr[j]) {
         minindex = j
      }
   }
   let temp = arr[i]
   arr[i] = arr[minindex]
   arr[minindex] = temp 
   
}
console.log(arr);
console.log(count);


