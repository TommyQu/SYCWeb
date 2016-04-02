app.controller('menuCtrl', function($scope, $http, $state, $cookies) {

	$http({
		method: 'GET',
		url: 'http://localhost:8080/SYCWeb/menu/getAllMenus.do'
		}).then(function successCallback(response) {
			$scope.allMenus = JSON.parse(response.data);
		}, function errorCallback(response) {
			alert(response.data);
		});
	
	var userCookie = $cookies.getObject('userCookie');
	
	$scope.toNewMenuPage = function() {
		window.location.href = "#/newMenu";
	};
	
	$scope.toSingleMenuPage = function(id) {
		window.location.href = "#/singleMenu/"+id;
	}
	
});