<c:if test="${empty user}">
	 <h3>Login</h3>
	 <form action='loginForm.html' method="post">
	 	<table>
	 		<tr>
	 			<td>Username:</td>
	 			<td><input type='text' name='username' value='${loginForm.username}' /></td>
	 		</tr>
	 		
	 		<tr>
	 			<td>Password:</td>
	 			<td><input type='text' name='password' value='${loginForm.password}'/></td>
	 		</tr>
	 		
	 		<tr>
	 			<td>
	 				<input type='submit' name='submit' value='Submit'/>
	 			</td>
	 		</tr>
	 	</table>
	 </form>
	 </c:if>
	 
	 <c:if test="${not empty user}">
	 		 <h3>Welcome ${user.username}</h3>
	 		  <form action='logout.html' method="post">
	 		  		<td>
	 					<input type='submit' name='submit' value='Logout'/>
	 				</td>
	 		  </form>
	 </c:if>