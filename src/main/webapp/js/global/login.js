app.controller('headerCtrl', function($scope, $http, $cookies) {
	var userCookie = $cookies.get('userCookie');
	$scope.loginShow = true;
	if("" != userCookie && userCookie != null) {
		var userObj = JSON.parse(userCookie);
		$scope.loginShow = false;
		$scope.nickname = userObj.nickname;
	}
	$scope.login = function () {
		var email = $scope.email;
		var pwd = $scope.pwd;
		$http({
			method: 'GET',
			url: 'http://localhost:8080/SYCWeb/user/login.do',
			params: {
				email: email,
				pwd: pwd
			}
		}).then(function successCallback(response) {
				var result = response.data;
				if("fail" == result)
					alert("Login Failed!");
				else {
					$cookies.put('userCookie', response.data);
					location.reload();
				}
			}, function errorCallback(response) {
				alert(response.data);
			});
	};
	$scope.signOut = function () {
		$cookies.remove('userCookie');
		location.reload();
	};
});
