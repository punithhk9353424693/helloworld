<html>
<body bgcolor="skyblue">
  <div style="width: 400px; height: 330px; background-color: grey; margin: 80px auto">
	<form action="insert">
	 <input type="text" placeholder="Enter your Mid" name="id" 
			style="width: 300px;height: 40px; margin-top: 20px;margin-left: 30px;"> 
		<input type="text" placeholder="Enter your Movie Name" name="name"
			style="width: 300px; height: 40px; margin-top: 20px;margin-left: 30px">
		 <input type="text" placeholder="Enter cost"
			name="cost" style="width: 300px;height: 40px; margin-top: 20px;margin-left: 30px"><br><br>
		<input type="submit" style="margin-left: 30px;padding: 10px;width: 80px">

		<button>
			<a href="update" style="text-decoration: none;padding-left:30px;padding: 20px;">Update</a>
		</button><br><br>
		<button>
			<a href="vanish" style="text-decoration: none;padding-left: 30px;padding: 20px;">Delete</a>
		</button><br><br>
		<button>
			<a href="getdetails" style="text-decoration: none;padding-left: 30px;padding: 20px;">Fetch</a>
		</button>
	</form>
	</div>
</body>
</html>
