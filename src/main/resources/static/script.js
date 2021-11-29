
    
    $(document).ready(function(){
        $(".table").on("click",".js-delete",  function(){
            let button =$(this);
            let table=$(".table");
            let urlBase= table.attr("urlBase");
            bootbox.confirm("Excluir registro?", function(result){
                if(result){
                    $.ajax({
                        url: urlBase + "/delete/" + button.attr("data-id"),
                        method : "GET",
                        success : function(){
                            window.location.href = urlBase + "/" ;
                        }
                    });
                    alert ("Registro excluido")
                }
            });
        });
    });

    
