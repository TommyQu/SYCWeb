app.controller('headerCtrl', function($scope, $http, $cookies) {
	
	var userCookie = $cookies.getObject('userCookie');
	$scope.loginShow = true;
	if("" != userCookie && userCookie != null) {
		$scope.loginShow = false;
		$scope.nickname = userCookie.nickname;
	}
	
	$scope.login = function () {
		var email = $scope.email;
		var nickname = $scope.nickname;
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
					userCookie = JSON.parse(response.data);
					$cookies.putObject('userCookie', userCookie);
					alert("Login Successfully!");
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
	
	$scope.signUp = function () {	
		var email = $scope.email;
		var nickname = $scope.nickname;
		var pwd = $scope.pwd;
		var gender = $('input[name=gender-radio]:checked', '#sign-up-form').val();
		console.log("signup");
		$http({
			method: 'GET',
			url: 'http://localhost:8080/SYCWeb/user/signUp.do',
			params: {
				email: email,
				nickname: nickname,
				pwd: pwd,
				gender: gender
			}
		}).then(function successCallback(response) {
				var result = response.data;
				if("exist" == result)
					alert("Email is already exists!");
				else if("success" == result) {
					alert("Sign up succeeded!");
					window.history.back();
				}
				else
					alert(result);
			}, function errorCallback(response) {
				alert(response.data);
			});
	};
});
