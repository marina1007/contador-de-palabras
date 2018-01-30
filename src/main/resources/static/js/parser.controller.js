

function parseText(){
    var textarea = document.getElementById('parrafo').value;

    /* valida que se ingrese algun texto*/
    if(textarea == null || textarea == ""){
        alert("Ingrese el texto")
    }

    getParsedText(textarea);

}

