const submit = document.getElementById("enviar");
submit.addEventListener("click", validarform);

submit.addEventListener("click", divValidar);

const reset = document.getElementById("limpar");
reset.addEventListener("click", limpar);

const editar = document.getElementById("editar");
editar.addEventListener("click", editarForm);

function divValidar() {

    var mostrarDados = document.querySelector('.mostrarDados');

    const nomev = document.getElementById("nome").value;
    const emailv = document.getElementById("email").value;
    const telv = document.getElementById("telefone").value;

    if (mostrarDados.style.display === 'block') {
        mostrarDados.style.display = 'none';

        
    } else {
        mostrarDados.style.display = 'block';
        document.getElementById("pNome").innerHTML = nomev;
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
    } else {
        nomev.disabled = true;
        nomev.classList.add("valid");
    }

    if (!emailv.value) {
        emailError.classList.add("visible");
        emailv.classList.add("invalid");
        emailError.setAttribute("aria-hidden", false);
        emailError.setAttribute("aria-invalid", true);
    } else {
        emailv.disabled = true;
        emailv.classList.add("valid");
    }

    if (!telv.value) {
        telError.classList.add("visible");
        telv.classList.add("invalid");
        telError.setAttribute("aria-hidden", false);
        telError.setAttribute("aria-invalid", true);
    } else {
        telv.disabled = true;
        telv.classList.add("valid");
    }

    return valid;
}

function editarForm(e) {
    e.preventDefault();

    const nomev = document.getElementById("nome");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");

    nomev.disabled = false;
    emailv.disabled = false;
    telv.disabled = false;
}

function limpar(e) {
    e.preventDefault();

    const nomev = document.getElementById("nome");
    const emailv = document.getElementById("email");
    const telv = document.getElementById("telefone");

    document.getElementById("nome").value = '';
    document.getElementById("email").value = '';
    document.getElementById("telefone").value = '';

    nomev.disabled = false;
    emailv.disabled = false;
    telv.disabled = false;

    nomev.classList.add("valid");
    emailv.classList.add("valid");
    telv.classList.add("valid");

}
