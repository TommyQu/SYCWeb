app.controller('singleMenuCtrl', function($scope, $http, $cookies, $stateParams) {
	
	var id = $stateParams.id;
	
	$http({
		method: 'GET',
		url: 'http://localhost:8080/SYCWeb/menu/getSingleMenu.do',
		params: {
			id: id
		}
		}).then(function successCallback(response) {
			$scope.singleMenu = JSON.parse(response.data);
		}, function errorCallback(response) {
			alert(response.data);
		});
	
	$scope.toNewMenuPage = function() {
		window.location.href = "#/newMenu";
	};
});