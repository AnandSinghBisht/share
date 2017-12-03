<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

    function crunchifyAjax() {
alert(sdfsdfs);

    	$.ajax({
    	    url : "ajaxtest",
    	    data : {
    	    "id" : ${articleCount}
    	    },
    	    success: function(data){
    	    //response from controller
    	    }
    	});

/*     	$.get({
        	type :'get',
            url : 'http://localhost:8080/ajaxtest',
            cache: false,
            contentType : "text/html",	
            success : function(data) {
                var msg=data
            	alert('Error while requestsdfasdfsdafdafe fasfdsaf sf..');
            	console.log("aaaaa");
                $('#result').html(msg);
            },
    		error: function(data){
    			alert('Error while request..'+data);
    		}
        });*/
    }
 </script>
<body>
	<div>
		<div>
			<h1>Spring Boot JSP Example</h1>
			<h2>Hello ${message}</h2>
			
			Click on this <strong><a href="next">link</a></strong> to visit another page.<br>
			Click on this <strong><a href="" onclick="crunchifyAjax()">link</a></strong> for Ajax page.
			
		</div>
		<div id="result">jsdfjaer jsdkfj asidfn asdf;hs;kdfh asidfhsidfye hdsfshafjk jsfdhsdufs bsdfsjdfsjhf sfhksjdfhue hdjjdhhdhdhhdhh  hhdjjdjyyyyhhh  hhsdfjjsdf jjhdsj</div>
	</div>
</body>
