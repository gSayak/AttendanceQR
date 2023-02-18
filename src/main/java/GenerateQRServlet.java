import java.io.IOException;
import java.io.OutputStream;
import java.util.EnumMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class GenerateQRServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String qrData = request.getParameter("qrData");
		if (qrData == null || qrData.trim().isEmpty()) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "QR data parameter is missing");
			return;
		}
		
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		
		int size = 250;
		String fileType = "png";
		Map<EncodeHintType, Object> hintMap = new EnumMap<>(EncodeHintType.class);
		hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		try {
			BitMatrix bitMatrix = qrCodeWriter.encode(qrData, BarcodeFormat.QR_CODE, size, size, hintMap);
			MatrixToImageWriter.writeToStream(bitMatrix, fileType, outputStream);
		} catch (WriterException e) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Failed to generate QR code: " + e.getMessage());
			return;
		}
		
		outputStream.flush();
		outputStream.close();
	}

}
