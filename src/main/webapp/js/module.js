var app = angular.module('sycWebApp', ["ui.router", "uiRouterStyles", "ngCookies"]);
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
		            templateUrl: "./view/menu/menu.html",
		            controller: "menuCtrl",
		            data: {
		            	css: 'http://localhost:8080/SYCWeb/css/menu/menu.css'
		            }
		        })
		        .state('newMenu', {
		            url: "/newMenu",
		            templateUrl: "./view/menu/newMenu.html",
		            controller: "newMenuCtrl",
		            data: {
		            	css: 'http://localhost:8080/SYCWeb/css/menu/newMenu.css'
		            }
		        })
		});