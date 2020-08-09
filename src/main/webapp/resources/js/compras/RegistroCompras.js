function getInputText(value)
{
    const nitProveedor = document.getElementById(value.id);
    console.log(nitProveedor.value);
    alert("no es valido");
    nitProveedor.focus();
}

const fechaFormat = (element) => {
    element.placeholder = 'dd/mm/yyyy';
}

const autoCompletarFecha = (fecha) => {
    console.log('fecha',fecha.value.toString().length)
    if(fecha.value.toString().length===2 ){
        fecha.value = fecha.value + '/';
    }
    if(fecha.value.toString().length===5 ){
        fecha.value = fecha.value + '/';
    }
}