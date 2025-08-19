
async function calculate(){
    const operation = document.querySelector(".select-option").value;

    const num1 = Number(document.getElementById("input-num1").value);
    const num2 = Number(document.getElementById("input-num2").value);

    const response = await fetch('sum/${num1}/${num2}');

    const result = await response.text();

    document.getElementById(result).innerText = "<h2>result :</h2>"  + result;



    /*const sum = num1 + num2;
    const sub = num1 - num2;
    const mult = num1 * num2;
    const div = num1 / num2;

    if(operation === "sum"){
        document.getElementById("out").innerHTML += `<h2>result: ${sum}</h2>`;
    }
    else if(operation === "sub"){
        document.getElementById("out").innerHTML += `<h2>result: ${sub}</h2>`;
    }
    else if(operation === "mult"){
        document.getElementById("out").innerHTML += `<h2>result: ${mult}</h2>`;
    }
    else if(operation === "div"){
        document.getElementById("out").innerHTML += `<h2>result: ${div}</h2>`;
    }
*/
   
}
