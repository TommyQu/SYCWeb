app.controller('newMenuCtrl', function($scope, $http, $cookies) {
	
	var userCookie = $cookies.getObject('userCookie');
	
	$scope.newMenu = function () {
		var title = $scope.title;
		var content = $scope.content;
		$http({
			method: 'GET',
			url: 'http://localhost:8080/SYCWeb/menu/newMenu.do',
			params: {
				title: title,
				content: content,
				userCookie: angular.toJson(userCookie)
			}
		}).then(function successCallback(response) {
				var result = response.data;
				if("fail" == result)
					alert("Create menu Failed!");
				else {
					alert("Create menu successfully!");
					window.history.back();
				}
			}, function errorCallback(response) {
				alert(response.data);
			});
	};
});
