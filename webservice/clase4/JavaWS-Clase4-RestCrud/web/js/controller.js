// URL del servicio REST

var rootURL = "http://localhost:8080/JavaWS-Clase4-RestCrud/recursos/vinos";
var vinoActual;

function inicializar() {
    $.ajaxSetup({cache: false});
    obtenerVinos();


    $('#btnAgregar').click(function () {
        nuevoVino(true);
        renderizarVino(vinoActual);
        return false;
    });


    $('#btnGuardar').click(function () {
        var myId = $('#txtVinoId').val();
        if (myId === "") {
            nuevoVino(true);
            agregarVino();
        }
        else {
            actualizarVino();
        }
        return false;
    });


    $('#btnBuscar').click(function () {
        obtenerVino();
        return false;
    });

    $('#btnBorrar').click(function () {
        borrarVino();
        return false;
    });
}

function agregarVino() {
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: rootURL,
        dataType: "json",
        data: formularioToJSON(),
        success: function (data, textStatus, jqXHR) {
            alert('Vino creado');
            obtenerVinos();
            renderizarVino({});
        }
    });
}

function obtenerVinos() {
    $.ajax({
        type: 'GET',
        url: rootURL,
        dataType: "json",
        success: renderizarLista
    });
}

function obtenerVino() {
    $.ajax({
        type: 'GET',
        url: rootURL + "/" + $('#txtBuscarPorNombre').val(),
        dataType: "json",
        success: renderizarVino
    });
}

function actualizarVino() {
    // alert(rootURL + "/" + $('#txtBuscarPorNombre').val());
    $.ajax({
        type: 'PUT',
        contentType: 'application/json',
        url: rootURL + "/" + vinoActual.id,
        dataType: "json",
        data: formularioToJSON(),
        success: function (data, textStatus, jqXHR) {
            alert('Vino actualizado');
            obtenerVinos();
            renderizarVino({});
        }
    });
}

function borrarVino() {
    $.ajax({
        type: 'DELETE',
        url: rootURL + "/" + vinoActual.id,
        dataType: "json",
        success: function (data, textStatus, jqXHR) {
            alert('Vino Eliminado');
            obtenerVinos();
            renderizarVino({});
        }
    });
}

function formularioToJSON() {

    var myId = $('#txtVinoId').val();
    var myNombre = $('#txtVinoNombre').val();
    var myAnio = $('#txtVinoAnio').val();
    var myDescripcion = $('#txtVinoDescripcion').val();
    var val = JSON.stringify({
        "id": myId === "" ? null : myId,
        "nombre": myNombre,
        "anio": myAnio,
        "descripcion": myDescripcion
    });
    return val;
}

function nuevoVino(foco) {
    vinoActual = {};
}

function renderizarLista(data) {
    var list = data;
    $('#listaVinos li').remove();
    $.each(list, function (index, vino) {
        $('#listaVinos').append('<li>' + vino.nombre + '</li>');
    });
}

function renderizarVino(data) {
    vinoActual = data;
    if (!vinoActual) {
        vinoActual = {};
    }
    $('#txtVinoId').val(vinoActual.id);
    $('#txtVinoNombre').val(vinoActual.nombre);
    $('#txtVinoAnio').val(vinoActual.anio);
    $('#txtVinoDescripcion').val(vinoActual.descripcion);
    $('#txtBuscarPorNombre').val("");

}