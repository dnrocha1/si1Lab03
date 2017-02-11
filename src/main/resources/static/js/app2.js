//var app2 = angular.module("todoApp2", []);

angular.module('todoApp').controller("todoListController23", function ($scope, $http) {

    $scope.todoListInput = "";
    $scope.todoLists = [];
    $scope.todoList = {};

    $scope.addTodoList = function () {
        $scope.todoList = {
            title:$scope.todoListInput
        };
        $scope.todoListInput = "";
        saveTodoLists();
    };

    $scope.loadTodoLists = function () {
        $http({method:'GET',url:'http://localhost:8080/todoList'}).
            then(function (responseSuccess) {
            $scope.todoLists = responseSuccess.data;
        }, function (responseFail) {
            console.log(responseFail.data);
            console.log(responseFail.status);
        });
    };

    saveTodoLists = function () {
        $http({method:'POST',url:'http://localhost:8080/todoList',data:$scope.todoList}).
            then(function (responseSuccess) {
            $scope.todoLists.push(responseSuccess.data);
            console.log($scope.todoLists);
        }, function (responseFail) {
            console.log(responseFail.data);
            console.log(responseFail.status);
        });
    };

    $scope.excluirTodoList = function (todoList) {
        $http({method:'DELETE',url:'http://localhost:8080/todoList/'+todoList.id}).
            then(function (responseSuccess) {
            var pos = $scope.todoLists.indexOf(todoList);
            $scope.todoLists.splice(pos,1);
        }, function (responseFail) {
            console.log(responseFail.data);
            console.log(responseFail.status);
        });
    };

    $scope.modifyTodoList = function (todoList) {
        $http({method:'PUT',url:'http://localhost:8080/todoList/'+todoList.id}).
        then(function (responseSuccess) {
            var pos = $scope.todoLists.indexOf(todoList);
            $scope.todoLists.splice(pos,1);
        }, function (responseFail) {
            console.log(responseFail.data);
            console.log(responseFail.status);
        });
    };

    $scope.loadTodoLists();
});

/*
 app.controller("taskController", function () {
    
});

 app.controller("toDoListController", function () {
    
});
*/