window.onload = function(){
    document.forms.formcontato.onsubmit = validaform;    
}

function validaform (e){
    let form = e.target;
    let formulario = true;

    const formcontato = document.getElementById('');
    const olhtml = document.querySelector('ol');

    const spanNomeCompleto = form.NomeCompleto.nextElementSibling;
    const spancpf = form.cpf.nextElementSibling;
    const spanemail = form.email.nextElementSibling;
    const spancursosbox = form.cursosbox.nextElementSibling;
    

    spanemail.textContent = "";
    spanNomeCompleto.textContent = "";
    spancpf.textContent = "";
    spancursosbox.textContent = "";
  
    const name = form.NomeCompleto.value.split(' ');
    console.log(name.length);
    
    const rad1 = document.getElementById("Frequentante");
    const rad2 = document.getElementById("Nao frequentante");

    if(rad1.checked === false && rad2.checked == false){    
        const spaned2 = rad2.nextElementSibling;
        spaned2.textContent = 'Indique se você é frequentante';
        formValido = false;
    }

    if(document.getElementById('cursosbox').value === ""){
        spancursosbox.textContent = 'Preencha o curso';
        document.getElementById('cursosbox').style.borderColor = 'red';  
        formulario = false;
        
    }
    if(form.NomeCompleto.value === ""){
        spanNomeCompleto.textContent = 'Nome não foi preenchido';
        document.getElementById('NomeCompleto').style.borderColor = 'red';
        formulario = false;
    }

    if(name.length <2){
        spanNomeCompleto.textContent = 'Preencha o nome com o sobrenome';
        document.getElementById('NomeCompleto').style.borderColor = 'red';
        formulario = false;
    }

    if(form.email.value === "" ){
        spanemail.textContent = 'Email não foi preenchido';
        document.getElementById('email').style.borderColor = 'red';
        formulario = false;
    }

    if(form.cpf.value.length != 11){
        spancpf.textContent = 'CPF deve conter 11 digitos';
        document.getElementById('cpf').style.borderColor = 'red';
        formulario = false;
    }
    if(form.cpf.value === ""){
        spancpf.textContent = 'CPF não foi preenchido';
        document.getElementById('cpf').style.borderColor = 'red';
        formulario = false;
    }
    

    

    if(!formulario){
        e.preventDefault();
    }
}