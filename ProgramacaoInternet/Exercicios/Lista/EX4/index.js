var selecionado;

var checkbox1 = document.getElementById('[name=Japonês]');
var checkbox2 = document.getElementById('[name=Chinês]');
var checkbox3 = document.getElementById('[name=Inglês]');
var checkbox4 = document.getElementById('[name=Alemão]');
var checkbox5 = document.getElementById('[name=Russo]');
var checkbox6 = document.getElementById('[name=Hebraico]');
var checkbox7 = document.getElementById('[name=Espanhol]');
var checkbox8 = document.getElementById('[name=Coreano]');
var checkbox9 = document.getElementById('[name=Latim]');
var checkbox10 = document.getElementById('[name=Italiano]');

document.getElementById("[name=btnSubmit]").onclick = function () {
    if (checkbox1.checked) {
        console.log("Japonês");
        selecionado++;
    }

    if (checkbox2.checked) {
        console.log("Chinês");
        selecionado++;
    }

    if (checkbox3.checked) {
        console.log("Inglês");
        selecionado++;
    }

    if (checkbox4.checked) {
        console.log("Alemão");
        selecionado++;
    }

    if (checkbox5.checked) {
        console.log("Russo");
        selecionado++;
    }

    if (checkbox6.checked) {
        console.log("Hebraico");
        selecionado++;
    }

    if (checkbox7.checked) {
        console.log("Espanhol");
        selecionado++;
    }

    if (checkbox8.checked) {
        console.log("Coreano");
        selecionado++;
    }

    if (checkbox9.checked) {
        console.log("Latim");
        selecionado++;
    }

    if (checkbox10.checked) {
        console.log("Italiano");
        selecionado++;
    }
    if(selecionado<3 || selecionado>8){
        console.log("Devem ser selecionados de 3 a 8 checkbox!!!");
    
    }
};
