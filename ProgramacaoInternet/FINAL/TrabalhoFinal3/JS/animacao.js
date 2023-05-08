$(document).ready(function(){
    $("a").hover(function(){
        $(this).animate({fontSize: "20px"}, "slow");
    }, function(){
        $(this).animate({fontSize: "14px"}, "slow");
    });
});
    