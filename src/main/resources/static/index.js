async function calculate(){
    const operation = document.querySelector(".select-option").value;

    const num1 = document.getElementById("input-num1").value;
    const num2 = document.getElementById("input-num2").value;

    try {
        const response = await fetch(`http://localhost:8080/MathController/${operation}?num1=${num1}&num2=${num2}`);
        // fetch - retorna o corpo da resposta de servidor 
        if (!response.ok){
            /* .ok -  é uma propriedade da interface Response que retorna true se o código de 
            status HTTP estiver na faixa de 200 a 299 (sucesso), e false caso contrário*/
            const erroMensage = await response.text();
            document.getElementById("out").innerHTML = `<h2>${erroMensage}</h2>`;
            return;
        }
        const result = await response.json(); //.json() - pega o corpo da requicição e transforma em um objeto JS
        //O await faz o código esperar a (Promise/objeto JS) terminar antes de continuar.
        document.getElementById("out").innerHTML = `<h2>Result: ${result}</h2>`;

    } catch (err){
        document.getElementById("out").innerHTML = `<h3>Error connecting to server.</h3>`;
    }
}
