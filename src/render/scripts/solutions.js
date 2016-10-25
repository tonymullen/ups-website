angular.module('solutions',['ui.bootstrap'])
  .controller('SolController', ['$scope', function($scope) {
    $scope.display = ($scope.pw === "apple");
  }]);
