var app = angular.module('educit',[]);

app.controller('Facturacion',Facturacion);

function Facturacion($scope){
  var edad = 32;
    $scope.nombre='Luis';
    $scope.verDatos = function(){
      return $scope.nombre + ' ' + edad;
    }
}