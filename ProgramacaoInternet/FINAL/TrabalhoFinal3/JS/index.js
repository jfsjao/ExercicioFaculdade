    const submit = document.getElementById("enviar");
    const reset = document.getElementById("limpar");
    const editar = document.getElementById("editar");
    const modal = document.getElementById("modal");
    const closeModal = document.getElementById("closeModal");

    submit.addEventListener("click", validarform);
    reset.addEventListener("click", limpar);
    editar.addEventListener("click", editarForm);
    closeModal.addEventListener("click", hideModal);

    function validarform(e) {
        e.preventDefault();

        const nomev = document.getElementById("nome");
        const emailv = document.getElementById("email");
        const telv = document.getElementById("telefone");
        const chktel = document.getElementById("chktel");
        const chkemail = document.getElementById("chkemail");
        
        const caixtext = document.getElementById("text");

        const nomeError = document.getElementById("nomecompletoError");
        const emailError = document.getElementById("emailError");
        const emailError1 = document.getElementById("emailError1");
        const telError = document.getElementById("telError");
        const telError1 = document.getElementById("telError1");
        const chkemailtelError = document.getElementById("chkemailtelError");
        const textError = document.getElementById("textError");

        let validnome, validemail,validtel, validcheck, validcaixa;

        if (!nomev.value) {
            nomeError.classList.add("visible");
            nomev.classList.add("invalid");
            nomeError.setAttribute("aria-hidden", false);
            nomeError.setAttribute("aria-invalid", true);

        } else {
            nomev.disabled = true;
            nomev.classList.add("valid");     
            nomeError.classList.remove("visible");
            validnome = true;
        }

        if (!emailv.value) {
            emailError1.classList.remove("visible");
            emailError.classList.add("visible");
            emailv.classList.add("invalid");
            emailError.setAttribute("aria-hidden", false);
            emailError.setAttribute("aria-invalid", true);
        } else if (!/@/.test(emailv.value) || !/\.com/.test(emailv.value)) {
            emailError.classList.remove("visible");
            emailError1.classList.add("visible");
            emailv.classList.add("invalid");
            emailError1.setAttribute("aria-hidden", false);
            emailError1.setAttribute("aria-invalid", true);
        } else {
            emailv.disabled = true;
            emailv.classList.add("valid");
            emailError.classList.remove("visible");
            emailError1.classList.remove("visible");
            validemail = true;
        }
        if (!telv.value) {
            telError.classList.add("visible");
            telv.classList.add("invalid");
            telError.setAttribute("aria-hidden", false);
            telError.setAttribute("aria-invalid", true);
        } else if (telv.value.length !== 10 && telv.value.length !== 11) {
            telError1.classList.add("visible");
            telv.classList.add("invalid");
            telError1.setAttribute("aria-hidden", false);
            telError1.setAttribute("aria-invalid", true);
        } else {
            telv.disabled = true;
            telError.classList.remove("visible");
            telError1.classList.remove("visible");
            telv.classList.add("valid");

            validtel = true;
        }
        
        if (!chktel.checked && !chkemail.checked) {
            chkemailtelError.classList.add("visible");
            chktel.classList.add("invalid");
            chkemail.classList.add("invalid");
            chkemailtelError.setAttribute("aria-hidden", false);
            chkemailtelError.setAttribute("aria-invalid", true);

        } else {
            chkemailtelError.disabled = true;
            chkemailtelError.classList.remove("visible");
            chkemailtelError.classList.add("valid");

            validcheck = true;
           
        }
        if (!caixtext.value) {
            textError.classList.add("visible");
            caixtext.classList.add("invalid");
            textError.setAttribute("aria-hidden", false);
            textError.setAttribute("aria-invalid", true);
        } else {
            caixtext.disabled = true; 
            textError.disabled = true;
            textError.classList.remove("visible");
            textError.classList.add("valid");
            validcaixa = true;
        }
        
        if (validnome && validemail && validtel && validcheck && validcaixa) {
            let valid = true;
            showModal(valid);  
        }

    }

    function showModal(valid) {
        if (valid) {
            modal.classList.add("show-modal");
            const nomev = document.getElementById("nome").value;
            const emailv = document.getElementById("email").value;
            const telv = document.getElementById("telefone").value;
            const caixtext = document.getElementById("text").value;
            const nomeError = document.getElementById("nomecompletoError");
            const emailError = document.getElementById("emailError");
            const telError = document.getElementById("telError");
            const chktel = document.getElementById("chktel");
            const chkemail = document.getElementById("chkemail");
            const checkError = document.getElementById("chkemailtelError");
            const textError = document.getElementById("textError");

            document.getElementById("pNome").innerHTML = nomev;
            document.getElementById("pEmail").innerHTML = emailv;
            document.getElementById("pTele").innerHTML = telv;
            document.getElementById("pText").innerHTML = caixtext;

            nomeError.classList.remove("visible");
            nomev.removeAttribute("disabled");
            nomev.classList.remove("invalid", "valid");
        
            
            
            
            emailError.classList.remove("visible");
            emailv.removeAttribute("disabled");
            emailv.classList.remove("invalid", "valid");

            telv.classList.remove("invalid", "valid");  
            telError.classList.remove("visible");
            telv.removeAttribute("disabled");

            checkError.classList.remove("visible");

            textError.classList.remove("visible");
            textError.removeAttribute("disabled");
            textError.classList.remove("invalid", "valid");
        }
    }

    function hideModal() {
        modal.classList.remove("show-modal");
    }

    function editarForm(e) {
        e.preventDefault();

        const nomev = document.getElementById("nome");
        const emailv = document.getElementById("email");
        const telv = document.getElementById("telefone");
        const caixtext = document.getElementById("text");

        caixtext.disabled = false;
        nomev.disabled = false;
        emailv.disabled = false;
        telv.disabled = false;
        hideModal();
    }

    function limpar(e) {
        e.preventDefault();

        const nomev = document.getElementById("nome");
        const emailv = document.getElementById("email");
        const telv = document.getElementById("telefone");
        const caixtext = document.getElementById("text");
        const nomeError = document.getElementById("nomecompletoError");
        const emailError = document.getElementById("emailError");
        const telError = document.getElementById("telError");
        const chktel = document.getElementById("chktel");
        const chkemail = document.getElementById("chkemail");
        const checkError = document.getElementById("chkemailtelError");
        const textError = document.getElementById("textError");

        nomev.value = "";
        emailv.value = "";
        telv.value = "";
        caixtext.value = "";
        chktel.checked = false;
        chkemail.checked = false;

        nomeError.classList.remove("visible");
        emailError.classList.remove("visible");
        telError.classList.remove("visible");
        nomev.classList.remove("invalid", "valid");
        emailv.classList.remove("invalid", "valid");
        telv.classList.remove("invalid", "valid");
        nomev.removeAttribute("disabled");
        emailv.removeAttribute("disabled");
        telv.removeAttribute("disabled");
        checkError.classList.remove("visible");
        textError.classList.remove("visible");
        caixtext.removeAttribute("disabled");
        caixtext.classList.remove("invalid", "valid");
        hideModal();
    }