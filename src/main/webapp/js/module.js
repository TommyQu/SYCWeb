var app = angular.module('sycWebApp', ["ui.router", "ngCookies"]);
		app.config(function($stateProvider, $urlRouterProvider){
			$urlRouterProvider.otherwise("/home")
		      
		      $stateProvider
		        .state('home', {
		            url: "/home",
		            templateUrl: "./view/home.html",
		            controller: "homeCtrl"
		        })
		        .state('signUp', {
		            url: "/signUp",
		            templateUrl: "./view/signUp.html",
		            controller: "headerCtrl"
		        })
		        .state('menu', {
		            url: "/menu",
		            templateUrl: "./view/menu/menu.html"
		        })
		})