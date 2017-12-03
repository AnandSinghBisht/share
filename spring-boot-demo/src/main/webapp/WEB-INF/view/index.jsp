<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

    function crunchifyAjax() {
     	$.get({
        	type :'get',
            url : 'http://localhost:8080/ajaxtest',
            cache: false,
            contentType : "text/html",	
            success : function(data) {
             
                $('#result').html(data);
            },
    		error: function(data){
    			alert('Error while request..'+data);
    		}
        });
    }
 </script>
<body>
	<div>
		<div>
			<h1>Spring Boot JSP Example</h1>
			<h2>Hello ${message}</h2>
			
			Click on this <strong><a href="next">link</a></strong> to visit another page.<br>
			Click on this <input type="button" onclick="crunchifyAjax()" value="button" name="Button"> </input> for Ajax page.
		</div>
		<div id="result">jsdfjaer jsdkfj asidfn asdf;hs;kdfh asidfhsidfye hdsfshafjk jsfdhsdufs bsdfsjdfsjhf sfhksjdfhue hdjjdhhdhdhhdhh  hhdjjdjyyyyhhh  hhsdfjjsdf jjhdsj</div>
	</div>
</body>
