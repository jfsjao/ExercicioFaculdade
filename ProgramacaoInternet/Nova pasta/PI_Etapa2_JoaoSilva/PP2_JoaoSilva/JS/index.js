const submit = document.getElementById("enviar");
const reset = document.getElementById("limpar");
const editar = document.getElementById("editar");
const mostrarDados = document.querySelector('.mostrarDados');

submit.addEventListener("click", validarform);
submit.addEventListener("click", mostrarDadosFunc);
reset.addEventListener("click", limpar);
editar.addEventListener("click", editarForm);

function mostrarDadosFunc() {
    const nomev = document.getElementById("nome").value;
    const emailv = document.getElementById("email").value;
    const telv = document.getElementById("telefone").value;

    if (mostrarDados.style.display === 'block') {
        mostrarDados.style.display = 'none';
    } else {
        mostrarDados.style.display = 'block';
        document.getElementById("nomev").innerHTML = nomev;
        document.getElementById("pEmail").innerHTML = emailv;
        document.getElementById("pTele").innerHTML = telv;
    }
}

function validarform(e) {   
    e.preventDefault();

    const nomev = document.getElementById("nome");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");

    const nomeError = document.getElementById("nomecompletoError");
    const emailError = document.getElementById("emailError");
    const telError = document.getElementById("telefoneError");

    let valid = true;

    if (!nomev.value) {
        nomeError.classList.add("visible");
        nomev.classList.add("invalid");
        nomeError.setAttribute("aria-hidden", false);
        nomeError.setAttribute("aria-invalid", true);
        valid = false;
    } else {
        nomeError.classList.remove("visible");
        nomev.classList.remove("invalid");
        nomeError.setAttribute("aria-hidden", true);
        nomeError.setAttribute("aria-invalid", false);
    }

    if (!emailv.value) {
        emailError.classList.add("visible");
        emailv.classList.add("invalid");
        emailError.setAttribute("aria-hidden", false);
        emailError.setAttribute("aria-invalid", true);
        valid = false;
    } else {
        emailError.classList.remove("visible");
        emailv.classList.remove("invalid");
        emailError.setAttribute("aria-hidden", true);
        emailError.setAttribute("aria-invalid", false);
    }

    if (!telv.value) {
        telError.classList.add("visible");
        telv.classList.add("invalid");
        telError.setAttribute("aria-hidden", false);
        telError.setAttribute("aria-invalid", true);
        valid = false;
    } else {
        telError.classList.remove("visible");
        telv.classList.remove("invalid");
        telError.setAttribute("aria-hidden", true);
        telError.setAttribute("aria-invalid", false);
    }
    if (!valid) {
        return;
    }
    // Mostrar dados do formulário
    var mostrarDados = document.querySelector('.mostrarDados');
    nomev = document.getElementById("nome").value;
    emailv = document.getElementById("email").value;
    telv = document.getElementById("telefone").value;
    
    mostrarDados.style.display = 'block';
    document.getElementById("pNome").value = nomev;
    document.getElementById("pEmail").value = emailv;
    document.getElementById("pTele").value = telv;
    // Desabilitar campos após validação
    nomev.disabled = true;
    emailv.disabled = true;
    telv.disabled = true;
}

function editarForm(e) {
    e.preventDefault();
    // Habilitar campos para edição
    const nomev = document.getElementById("nome");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");
    nomev.disabled = false;
    emailv.disabled = false;
    telv.disabled = false;
    // Esconder dados do formulário
    var mostrarDados = document.querySelector('.mostrarDados');
    mostrarDados.style.display = 'none';
}

function limpar(e) {
    e.preventDefault();
    // Limpar campos do formulário
    const nomev = document.getElementById("nome");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");


    document.getElementById("nome").value = '';
    document.getElementById("email").value = '';
    document.getElementById("telefone").value = '';
    // Habilitar campos para edição
    nomev.disabled = false;
    emailv.disabled = false;
    telv.disabled = false;
    // Esconder dados do formulário
    var mostrarDados = document.querySelector('.mostrarDados');
    mostrarDados.style.display = 'none';
