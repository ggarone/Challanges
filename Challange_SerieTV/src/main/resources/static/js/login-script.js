$(function(){


    $("#btn").on("click", function(event){
        sessionStorage.clear();
        
        $.ajax({
            url:"https://api.tvmaze.com/search/shows?q="  + $("#film").val(),
            type: "get",
            dataType: "json",
            success: function(data){
                console.log(data);
                if(data.length == 0){
                    $("#mex").html("Non esiste")
                    event.preventDefault();
                }else{
                    let oggetto = {
                        "id" : data[0].show.id,
                        "titolo": data[0].show.name,
                        "genere": data[0].show.genres.join(","),
                        "ratio": data[0].show.rating.average,
                        "summary": data[0].show.summary,
                        "img": data[0].show.image.original
                    }
                    console.log(oggetto);
                    sessionStorage.setItem("Serie", JSON.stringify(oggetto))
                    $.ajax({
                        url:"https://jsonplaceholder.typicode.com/users/"  + Math.floor((Math.random()*10)+ 1),
                        type: "get",
                        dataType: "json",
                        success: function(data){
                            let utenti = {
                                "id": data.id,
                                "username": data.username
                            }
                            console.log(utenti);
                            sessionStorage.setItem("User", JSON.stringify(utenti))
                            location.href = "acquista.html"
                            
                        }
                    })
                 
                    
                }
            }})
        
        
    })
        
     $('#film').keyup(function(event){
        if(event.keyCode == 13){
            $('#btn').click();
        }
    })
    
    
    

})













// /* When the user clicks on the button,
// toggle between hiding and showing the dropdown content */
// function myFunction() {
//     document.getElementById("myDropdown").classList.toggle("show");
//   }
  
//   function filterFunction() {
//     var input, filter, ul, li, a, i;
//     input = document.getElementById("myInput");
//     filter = input.value.toUpperCase();
//     div = document.getElementById("myDropdown");
//     a = div.getElementsByTagName("a");
//     for (i = 0; i < a.length; i++) {
//       txtValue = a[i].textContent || a[i].innerText;
//       if (txtValue.toUpperCase().indexOf(filter) > -1) {
//         a[i].style.display = "";
//       } else {
//         a[i].style.display = "none";
//       }
//     }
//   }

