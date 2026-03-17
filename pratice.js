//array insert

let arr = [10,20,30,40,50,60,70,80,90,100];
let position = 3;
let element = 35;


for(let i = arr.length-1;i>=0;i--){
    //console.log(arr[i]);
    
    if( i>= position){
        arr[i+1] = arr[i];
        if (i==position) {
            arr[i]= element;
        }
    }
    
}
console.log(arr);
console.log("hello world ");
