$(function(){

$("#add").click(function(){

    $.ajax({
        type: "post",
        url: "http://localhost:9070/api/viaggi/add",
        dataType: "json",
        data: {
            nome: $("#dest").val() + " - " + $("#dur").val(),
            descrizione: $("#desc").val(),
            destinazione: $("#dest").val(),
            durata: $("#dur").val(),
            prezzo: $("#price").val()
        },
        success: function (response) {
            console.log(response);
        }
    });

})




})