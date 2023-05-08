$(document).ready(function () {
    $("button").click(function () {
        $("#div1").fadeIn(1000).delay(1000).fadeOut(1000);
        $("#div2").fadeIn(2000).delay(1000).fadeOut(1000);
        $("#div3").fadeIn(3000).delay(1000).fadeOut(1000);
    });
});