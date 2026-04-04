// let abc = "naused"
// abc[2] ="r"
// console.log(abc);
 // naused
 //---instead of removing square barket [2] , then what will be the output --//r



//-------------------------------------------------------------------------------------------------

//  let a  = 100;
//  let z = a++; //  z = 100 , a=101 ------post-increment   
//  console.log(a+z);//101+100
 

//-------------------------------------------------------------------------------------------------

// let str = "my name is xyz";
// let newstr = str.split(" ").reverse()

// console.log(newstr);




// ------------------callback function  --  callback function is used to handle asquerence task and callback function defined function inside function parameter
//  function NAme(hello) {
//     hello();
//    console.log("name function");    
   
//  }

//  function hello() {
//     console.log("hello world ");
    
//  }
// NAme(hello)

let  dup = [1,2,3,4,5,6,7,8,1,2]
dup.map((value,index)=>{
    if (value !== index ) {
        console.log(dup);
        
    }
})