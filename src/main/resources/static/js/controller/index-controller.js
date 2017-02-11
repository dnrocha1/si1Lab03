/**
 * Created by Daniyel on 09/02/2017.
 */
angular.module('todoApp').controller("indexController", function ($scope, $http) {

    loadTasks = function () {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/tasks'
        }).then(function (responseSuccess) {
            $scope.totalTasks = responseSuccess.data.length;
        }, function (responseFail) {
            console.log(responseFail.data);
            console.log(responseFail.status);
        });
    };

    loadTasks();
});
