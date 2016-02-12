var app = angular.module('sycWebApp', []);
app.controller('loginCtrl', function($scope, $http) {
	$scope.login = function () {
		$http({
			method: 'GET',
			url: 'user/login.do',
			params: {
				email: $scope.email,
				pwd: $scope.pwd
			}
		}).then(function successCallback(response) {

			}, function errorCallback(response) {

			});
//		$http.get("user/login.do")
//		.then(function(response) {
//			var myWelcome = response.data;
//			alert(myWelcome);
//		});
	};

});