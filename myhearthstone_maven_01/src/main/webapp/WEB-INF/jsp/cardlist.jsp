<div id="container">
<h1>Hearthstone Database</h1>
<div id="demo_jui">
<table id="cards" class="display">
 <thead>
                  <tr>
                      <th><u>Name</u></th>
                      <th><u>Type</u></th>
                      <th><u>Cost</u></th>
                      <th><u>Rartity</u></th>
                      <th><u>Description</u></th>
                      <th><u>Power</u></th>
                      <th><u>Toughness</u></th>
                      <th><u>Class</u></th>
                      <th><u>Subtype</u></th>
                  </tr>
              </thead>

             <tbody>
             	<c:forEach items="${cards}" var="card">
			        <tr>
			          		<td>${card.name}</td>
							<td>${card.type}</td>
							<td>${card.cost}</td>
							<td>${card.rarity}</td>
							<td>${card.description}</td>
							<td>${card.power}</td>
							<td>${card.toughness}</td>
							<td>${card.className}</td>
							<td>${card.subType}</td>
			        </tr>
     		  	</c:forEach>	
              </tbody>
         </table>
         </div>
 </div>











