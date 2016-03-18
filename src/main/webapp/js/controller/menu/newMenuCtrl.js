app.controller('newMenuCtrl', function($scope, $http, $cookies) {
	
	var userCookie = $cookies.getObject('userCookie');
	
	$scope.newMenu = function () {
		var title = $scope.title;
		var content = $scope.content;
		alert(angular.toJson(userCookie));
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
					alert("Login Failed!");
				else {
					location.reload();
				}
			}, function errorCallback(response) {
				alert(response.data);
			});
	};
});
