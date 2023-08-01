/**
 * 
 */

  function checkEmptyField(fieldId) {
 	alert('checkEmptyField '+fieldId);
 }
 
 
 function validate() {
				var a=document.getElementById('district').value;
				var b=document.getElementById('name').value;
				var c=document.getElementById('dob').value;
				var d=document.getElementById('mobile').value;
				var e=document.getElementById('email').value;
				var f=document.getElementById('institutecode').value;
				var g=document.getElementById('aadhar').value;
				var h=document.getElementById('bankifsc').value;
				var i=document.getElementById('bankaccount').value;
				var j=document.getElementById('bankname').value;
				var k=document.getElementById('password').value;
				var l=document.getElementById('confirmpassword').value;

				if(a =="") {	
					document.getElementById("districtErr").innerHTML="District cannot be blank";
					return false;
				}	
				if(b =="") {	
					document.getElementById("nameErr").innerHTML="Name cannot be blank";
					return false;
				}	
				if(c =="") {	
					document.getElementById("dobErr").innerHTML="Date of Birth cannot be blank";
					return false;
				}	
				if(d =="") {	
					document.getElementById("mobileErr").innerHTML="Mobile number cannot be blank";
					return false;
				}	
				if(e =="") {	
					document.getElementById("emailErr").innerHTML="Email ID cannot be blank";
					return false;
				}
				if(f =="") {	
					document.getElementById("institutecodeErr").innerHTML="Institute code cannot be blank";
					return false;
				}	
				if(g =="") {	
					document.getElementById("aadharErr").innerHTML="AAdhar number cannot be blank";
					return false;
				}	
				if(h =="") {	
					document.getElementById("bankifscErr").innerHTML="Bank IFSC cannot be blank";
					return false;
				}	
				if(i =="") {	
					document.getElementById("bankaccountErr").innerHTML="Bank Account number cannot be blank";
					return false;
				}	
				if(j =="") {	
					document.getElementById("banknameErr").innerHTML="Bank name cannot be blank";
					return false;
				}	
				if(k =="") {	
					document.getElementById("passwordErr").innerHTML="Password cannot be blank";
					return false;
				}	
				if(l =="") {	
					document.getElementById("confirmpasswordErr").innerHTML="Re enter the password";
					return false;
				}	
				
				return true;
			}	
			
			
function clearDistrictErrMsg() {
				document.getElementById('districtErr').innerHTML="";

}
			
function clearNameErrMsg() {
				document.getElementById('nameErr').innerHTML="";

}
function clearDOBErrMsg() {
				document.getElementById('dobErr').innerHTML="";

}
			
function clearMobileErrMsg() {
				document.getElementById('mobileErr').innerHTML="";

}

function clearEmailErrMsg() {
				document.getElementById('emailErr').innerHTML="";

}
			
function clearInstituteCodeErrMsg() {
				document.getElementById('institutecodeErr').innerHTML="";

}

function clearAadharErrMsg() {
				document.getElementById('aadharErr').innerHTML="";

}
			
function clearBankIFSCErrMsg() {
				document.getElementById('bankifscErr').innerHTML="";

}

function clearBankAccountErrMsg() {
				document.getElementById('bankaccountErr').innerHTML="";

}
			
function clearBankNameErrMsg() {
				document.getElementById('banknameErr').innerHTML="";

}
function clearPasswordErrMsg() {
				document.getElementById('passwordErr').innerHTML="";

}
			
function clearConfirmPasswordErrMsg() {
				document.getElementById('confirmpasswordErr').innerHTML="";

}


function validateName() {
      const nameInput = document.getElementById('name');
      const name = nameInput.value.trim(); // Trim whitespaces from the name

      // Regular expression to match letters (both uppercase and lowercase)
      const letters = /^[A-Za-z]+$/;

      if (name.match(letters)) {
        return true;
      } else {
        alert("Enter a valid name (only letters allowed)");
        nameInput.focus(); // Set focus back to the name input field
        return false;
      }
      
      
      }

/*function validateName() {
      const pattern = document.getElementById('name').value;

      const lower = /[a-z]/;
      const upper = /[A-Z ]/;
      const number = /[0-9]/;
      const special= /[!@#$%^&*()_+[\]{};':"\\|,.<>?]/;

      const containsLower = lower.test(pattern);
      const containsUpper = upper.test(pattern);
      const containsNumber = number.test(pattern);
      const containsSpecial = special.test(pattern);

      if ((containsLower || containsUpper )&& !(containsNumber) && !(containsSpecial)) {
        return true;
      } else {
        alert("Enter valid name");
        return false;
      }
    }
 */
/*
function validateEmail() {
  const res = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;
  if(res.test(document.getElementById('email').value.toLowerCase())==false){
	  
	alert('Invalid Email Address');
  }
  
  return res.test(document.getElementById('email').value.toLowerCase());
 }
*/