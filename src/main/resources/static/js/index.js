window.onload = showAllInquiry();

function sendInquiry(){
    const name = document.getElementById("name");
    const email = document.getElementById("email");
    const body = document.getElementById("body");
    const inquiry = {name: name, email: email, body: body}

    // ajax post
    $.post("/inquiry", inquiry)
        .done(function(response){
            showAllInquiry();
        })
}

function showAllInquiry(){
    $.get("/inquiry")
        .done(function(response){
            const json = JSON.parse(response)
            $.each(json, function (i, e){
                $('#inquiryTable tr').remove();
                const appendData = "<tr><td>"
                                + i + "</td><td>"
                                + e.name + "</td><td>"
                                + e.mail + "</td><td>"
                                + e.body + "</td><td>"
                                + e.timestamp
                                + "</td></tr>";
                $('#inquiryTable').append(appendData);
            });
        })
}