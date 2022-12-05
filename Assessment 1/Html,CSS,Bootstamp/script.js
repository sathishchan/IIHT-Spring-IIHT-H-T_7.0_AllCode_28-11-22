var form = document.getElementById('form')

form.addEventListener('submit',function(event) {
    event.preventDefault()

    var fullname = document.getElementById('fullname').value
    console.log("Name : "+fullname)

    var birth = document.getElementById('birth').value
    console.log("Date of Birth: "+birth)

    var email = document.getElementById('email').value
    console.log("Email ID: "+email)

    var mobile = document.getElementById('mobile').value
    console.log("Mobile Number: "+mobile)

    var gender = document.getElementById('gender').value
    console.log("Gender: "+gender)

    var occupation = document.getElementById('occupation').value
    console.log("Occupation: "+occupation)

    var idtype = document.getElementById('idtype').value
    console.log("ID Type: "+idtype)

    var idnumber = document.getElementById('idnumber').value
    console.log("ID Number: "+idnumber)

    var issueauthority = document.getElementById('issueauthority').value
    console.log("Issue Authority: "+issueauthority)

    var issuedate = document.getElementById('issuedate').value
    console.log("Issue Date: "+issuedate)

    var issuestate = document.getElementById('issuestate').value
    console.log("Issue State: "+issuestate)

    var expirydate = document.getElementById('expirydate').value
    console.log("Expity Date: "+expirydate)
})

function Success() {
    alert("Registerted Successfully");
}