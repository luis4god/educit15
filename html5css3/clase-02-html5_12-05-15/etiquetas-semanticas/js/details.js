(function($){
$.fn.htmlDetails = function(options){
var defaults = {
  selectorCapaDetalle: '.bloque-detalle'
  ,htmlCapaDetalle: '<div class="bloque-detalle" />'
  ,clasePlegado: 'detalle-plegado'
  ,textoMostrar: ''
  ,textoOcultar: ''
};
var datos = {};

var op = $.extend(defaults, options);

return this.each(function(){
  var componente = $(this);
  iniciarComponente(componente);
});

function iniciarComponente (componente) {
  // Verificación de ausencia de soporte para el elemento
  if (!('open' in document.createElement('details'))) {
    // Si no hay soporte, se continúa
    plegarContenido(componente);
  }
  
}

function plegarContenido (componente) {
  /* Se pliega el contenido, y se añade una capa por encima de los
  elementos (que será a la que se alterne la visibilidad) */
  componente.children(':not(summary)').wrapAll(op.htmlCapaDetalle);
  var detalle = componente.children(op.selectorCapaDetalle);
  detalle.hide();
  prepararEnlace(componente,detalle);
}

function prepararEnlace (componente,detalle) {
  /* El elemento SUMMARY no va a coger el foco 
  al no haber soporte, habrá que añadirle un 
  elemento que pueda coger foco */
  var titulo = componente.find('summary').eq(0);
  var texto = titulo.text();
  titulo.html('<a href="#">'+texto +op.textoMostrar+ '</a>');
  titulo.addClass(op.clasePlegado)
  alternarDetalle(detalle,titulo);
}

function alternarDetalle (detalle,titulo) {
  titulo.find('a').bind('click',function (event) {
    event.preventDefault();
    alternarTexto($(this));
    titulo.toggleClass(op.clasePlegado);
    detalle.toggle();
  })
}

function alternarTexto (enlace) {
  var elementoTexto = enlace.find('span').eq(0);
  var texto = elementoTexto.text();
  if (texto==op.textoMostrar) {
    elementoTexto.text(op.textoOcultar);
  } else {
    elementoTexto.text(op.textoMostrar);
  }
}

}})(jQuery);