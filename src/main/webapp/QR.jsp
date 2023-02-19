<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QR Code Generator</title>
</head>
<body>
	<h1>QR Code Generator</h1>
	<form action="GenerateQRServlet" method="post">
		<label for="qrData">Enter QR data:</label> <input type="text"
			name="qrData" id="qrData">
		<button type="submit">Generate QR Code</button>
	</form>
</body>
</html>