app.controller('menuCtrl', function($scope, $http, $cookies) {
	
	var userCookie = $cookies.getObject('userCookie');

	angular.element(document).ready(function() {
		$http({
			method: 'GET',
			url: 'http://localhost:8080/SYCWeb/menu/getAllMenus.do'
			}).then(function successCallback(response) {
				$scope.allMenusJSON = JSON.parse(response.data);
			}, function errorCallback(response) {
				alert(response.data);
			});
	});
	$scope.toNewMenuPage = function() {
		window.location.href = "#/newMenu";
	};
	
	
});