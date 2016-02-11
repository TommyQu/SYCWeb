function login() {
	var app = angular.module('sycWebApp', []);
	app.controller('loginCtrl', function($scope, $http) {
	    $http.get("user/login.do")
	    .then(function(response) {
	        $scope.myWelcome = response.data;
	    });
	});
}