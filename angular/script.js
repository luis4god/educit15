var app = angular.module('educit',[]);

app
.controller('Facturacion',Facturacion)
.controller('Persona',Persona);

function Facturacion($scope){
  var total = 32;
    $scope.nombre='Facturacion';
    $scope.verDatos = function(){
      return $scope.nombre + ' ' + total;
    }
}
function Persona($scope){
  var edad = 32;
    $scope.nombre='Luis';
    $scope.verDatos = function(){
      return $scope.nombre + ' ' + edad;
    }
}