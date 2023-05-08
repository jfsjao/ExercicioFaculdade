const submit = document.getElementById("Enviar");
submit.addEventListener("click", validarform);

const reset = document.getElementById("Limpar");
reset.addEventListener("click", Limpar);

const editar = document.getElementById("Editar");
editar.addEventListener("click", editarForm);

function validarform(e){
    e.preventDefault();

    const nomev = document.getElementById("nomecompleto");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");

    const nomeError = document.getElementById("nomecompletoError");
    const emailError = document.getElementById("emailError");
    const telError = document.getElementById("telefoneError");
    
    let valid = true;

    if(!nomev.value){
        nomeError.classList.add("Visible");
        nomev.classList.add("invalid");
        nomeError.setAttribute("aria-hidden", false);
        nomeError.setAttribute("aria-invalid", true);
    }else{
        nomev.disabled = true;
        nomev.classList.add("valid");
    }

    if(!emailv.value){
        emailError.classList.add("Visible");
        emailv.classList.add("invalid");
        emailError.setAttribute("aria-hidden", false);
        emailError.setAttribute("aria-invalid", true);
    }else{
        emailv.disabled = true;
        emailv.classList.add("valid");
    }

    if(!telv.value){
        telError.classList.add("Visible");
        telv.classList.add("invalid");
        telError.setAttribute("aria-hidden", false);
        telError.setAttribute("aria-invalid", true);
    }else{
        telv.disabled = true;
        telv.classList.add("valid");
    }

    return valid;
}

function editarform(e){
    e.preventDefault();

    const nomev = document.getElementById("nomecompleto");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");

    nomev.disabled = false;
    emailv.disabled = false;
    telv.disabled = false;
}

function Limpar(e){
    e.preventDefault();

    const nomev = document.getElementById("nomecompleto");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");

    document.getElementById("nomecompleto").value = '';
    document.getElementById("email").value = '';
    document.getElementById("telefone").value = '';

    nomev.disabled = false;
    emailv.disabled = false;
    telv.disabled = false;

    nomev.disabled = false;
    emailv.disabled = false;
    telv.disabled = false;

    nomev.classList.add("valid");
    emailv.classList.add("valid");
    telv.classList.add("valid");

}