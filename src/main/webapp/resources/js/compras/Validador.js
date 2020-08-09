const tables = Array.from(document.getElementsByTagName("input"));

 const validarNit = (nit) => {
    console.log(nit.id);
    elment = document.getElementById('j_idt8:tablaCompras:0:nitProveedor');
    console.log(nit.id);

    let elementoInput= tables.find(x => x.id.toString() === nit.id.toString());
     elment.focus();
    console.log(elementoInput.id);
     elementoInput.focus();




}


const validarDigitoVerificador = (nit) =>{
    let vCheck = 0;
    const lnit = parseInt(nit);
    const snumero = Array.from(String(lnit), Number);
    const vLargo = snumero.length;
    let i = vLargo - 1;
    console.log('i',i);
    for (j = 0; i >= 0; ++j) {
        let x = j % 8;
        let s = snumero[i].toString();
        let y = parseInt(s);
        let z = matriz_permutaciones(x, y);
        vCheck = matriz_verhoeff(vCheck, z);
        console.log('vCheck',vCheck);
        --i;
    }
    const ret = vCheck === 0 ? 1 : 0;
    return ret
}

const matriz_verhoeff = (x, y) => {
  const v = ['0123456789', '1234067895', '2340178956', '3401289567', '4012395678', '5987604321', '6598710432', '7659821043', '8765932104', '9876543210'];
    let vSalida = '0';
    if (x === 0) {
        vSalida = v[0].substring(y, y + 1);
    } else if (x === 1) {
        vSalida = v[1].substring(y, y + 1);
    } else if (x === 2) {
        vSalida = v[2].substring(y, y + 1);
    } else if (x === 3) {
        vSalida = v[3].substring(y, y + 1);
    } else if (x === 4) {
        vSalida = v[4].substring(y, y + 1);
    } else if (x === 5) {
        vSalida = v[5].substring(y, y + 1);
    } else if (x === 6) {
        vSalida = v[6].substring(y, y + 1);
    } else if (x === 7) {
        vSalida = v[7].substring(y, y + 1);
    } else if (x === 8) {
        vSalida = v[8].substring(y, y + 1);
    } else if (x === 9) {
        vSalida = v[9].substring(y, y + 1);
    } else {
        vSalida = '-1';
    }

    return parseInt(vSalida);
}

const matriz_permutaciones = (x,y) => {
    const v = ['0123456789', '1576283094', '5803796142', '8916043527', '9453126870', '4286573901', '2793806415', '7046913258'];
    let vSalida = '0';
    if (x === 0) {
        vSalida = v[0].substring(y, y + 1);
    } else if (x === 1) {
        vSalida = v[1].substring(y, y + 1);
    } else if (x === 2) {
        vSalida = v[2].substring(y, y + 1);
    } else if (x === 3) {
        vSalida = v[3].substring(y, y + 1);
    } else if (x === 4) {
        vSalida = v[4].substring(y, y + 1);
    } else if (x === 5) {
        vSalida = v[5].substring(y, y + 1);
    } else if (x === 6) {
        vSalida = v[6].substring(y, y + 1);
    } else if (x === 7) {
        vSalida = v[7].substring(y, y + 1);
    } else {
        vSalida = '-1';
    }

    return parseInt(vSalida);
}