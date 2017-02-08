var app = angular.module('todoApp', ['ui.router', 'restangular','bw.paging']);

//restangular
app.config(function (RestangularProvider) {
    RestangularProvider.setBaseUrl('http://localhost:8080/');
});

//ui.router
app.config(function ($stateProvider) {
    //$urlRouterProvider.otherwise('/');
    $stateProvider
        .state('todoList',{
            url:'/todoList',
            templateUrl: 'view/todoList.html',
            controller: 'todoListController',
        })
        .state('task',{
            url:'/tasks',
            templateUrl: 'view/task.html',
        })
        .state('category',{
            url:'/taskcategories',
            templateUrl: 'view/category.html'
        })
});

/*app.config(['$stateProvider', function ($stateProvider) {
    $stateProvider
        .state('todoList',{
            url:'/todoList',
            templateUrl: 'view/todoList2.html',
            controller: 'todoListController',
        })
        .state('task',{
            url:'/tasks',
            templateUrl: 'view/task.html',
        })
}]);*/

/*app.config(["$locationProvider", function($locationProvider) {
    $locationProvider.html5Mode(true);

 <base href="/"/>
}]);*/