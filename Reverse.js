 //REVERSE OF ARRAY 
// ------------------------------------------------------------------------------
//  let arr = [10,20,30,40,50,60,70,80,90,100];

//  for (let i = arr.length-1; i >= 0; i--) {
//     console.log(arr[i]);
    
//  }

//---------------------------------------------------------------------------------
//Two-pointer method
let arr = [1, 2, 3, 4, 5];

let start = 0;
let end = arr.length - 1;

while (start < end) {
    let temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    start++;
    end--;
}

console.log(arr); // [5, 4, 3, 2, 1]

//----------------------------------------------------------------------------------