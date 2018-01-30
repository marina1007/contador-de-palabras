


function getParsedText(textarea){
    var url = "/parser?parrafo=" + textarea;

    $.get(url, function(data){
        $("#results").empty();
        var paragraphResult = data;
        var divResult = $("#results");
        for(var k in paragraphResult) {
            divResult.append("<p>" + k + " => " + paragraphResult[k] + "</p>");
        }
    });
}



