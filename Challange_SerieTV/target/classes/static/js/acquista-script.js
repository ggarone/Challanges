var oggetto = JSON.parse(sessionStorage.getItem("Serie"))
var utenti = JSON.parse(sessionStorage.getItem("User"))

console.log(oggetto);
console.log(utenti);

$(".card-img-top").attr("src", oggetto.img)
$(".card-title").html(oggetto.titolo)
$(".card-genre").html(oggetto.genere)
$(".card-ratio").html(oggetto.ratio)
$(".card-sum").html(oggetto.summary)




$("#btnBuy").on("click", function(){
    $("#grazie").html("Grazie per l'acquisto")
    $.ajax({
        // url: "multipart/form-data",
        url: "http://localhost:9100/api/acquisto",
        type: "post",
        dataType: "json",
        contentType: "application/json",
        data:JSON.stringify(
        {
            "user": {
                "id": utenti.id,
                "nome": utenti.username
            },
            "serieTV": {
                "id": oggetto.id,
                "titolo": oggetto.titolo,
                "genere": oggetto.genere,
                "rating": oggetto.ratio,
                "summary": oggetto.summary,
                "img": oggetto.img
            },
            "data": "2022-03-21"
        }),
        success: function(response){
            console.log(response);
        }
    })
})