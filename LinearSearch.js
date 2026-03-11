let arr = [10,20,30,40,50,60,70,80,90,100,40];
let element = 40;
let element_index = undefined;

for (let i = 0; i < arr.length; i++) {
    //console.warn(arr[i]);
    if (arr[i] ===element) {
       // console.log(`element ${element} is  found at index ${element_index =i}`);
        break;
        
    }
    
}
// some extra function 

arr.splice(3,1) // --- splice() array ke elements ko add, delete, ya replace karta hai aur original array ko modify karta hai.
console.warn(arr)