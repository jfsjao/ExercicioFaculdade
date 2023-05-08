function addpessoa(nome, cpf, tel, email){
    var tb = document.getElementById("tbpessoas");
    var qtdlin = tb.rows.length;
    var linha = tb.insertRow(qtdlin);

    var cellCod = linha.insertCell(0);
    var cellNome = linha.insertCell(1);
    var cellCpf = linha.insertCell(2);
    var cellTel = linha.insertCell(3);
    var cellEmail = linha.insertCell(4);

    cellCod.innerHTML = qtdlin;
    cellNome.innerHTML = nome;
    cellCpf.innerHTML = cpf;
    cellTel.innerHTML = tel;
    cellEmail.innerHTML = email;
}