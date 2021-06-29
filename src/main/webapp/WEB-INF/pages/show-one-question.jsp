
<%@ include file="./header.jspf" %>


	<div class="container">
		<div class="row">
			<div class="col-8">
				<div class="card">
				  <h5 class="card-header">${question.question}</h5>
				  <div class="card-body">
				    <div class="card-text">
				    	<span class="btn btn-light ml-3" >${question.option1}</span>
				    	<span class="btn btn-light ml-3" >${question.option2}</span>
				    	<span class="btn btn-light ml-3" >${question.option3}</span>
				    	<span class="btn btn-light ml-3" >${question.option4}</span>
				    </div>
				    <a href="<sap:url value="/questionupdate?id=${question.quesid}">
	         				</sap:url>" class="btn btn-primary">Edit</a>

	         	
					      <a href="<sap:url value="/delete-question/?id=${question.quesid}">
	         				</sap:url>" class="btn btn-success">Delete</a>
	         		  
	         		  
	         		
				  </div>
				</div>
			</div>
		</div>
	
	</div>



</body>
</html>