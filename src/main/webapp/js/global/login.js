var app = angular.module('sycWebApp', []);
app.controller('loginCtrl', function($scope, $http) {
	$scope.login = function () {
		var email = $("#email").val();
		var pwd = $("#pwd").val();
		$http({
			method: 'GET',
			url: 'user/login.do',
			params: {
				email: email,
				pwd: pwd
			}
		}).then(function successCallback(response) {

			}, function errorCallback(response) {

			});
	};

});