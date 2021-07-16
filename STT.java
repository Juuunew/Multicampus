package test1.speech;

import java.io.*;
import java.net.*;

public class STT {

	public static void main(String[] args) {
		
		String clientId = "";             // Application Client ID";
        String clientSecret = "";     // Application Client Secret";
		
		DataOutputStream dos = null;
		BufferedReader br = null;
		
		
		try {
			String language = "Kor";
			String apiURL = "https://naveropenapi.apigw.ntruss.com/recog/v1/stt?lang=" + language;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			// get or post 지정
			con.setRequestMethod("POST");
			con.setUseCaches(false);
			con.setDoOutput(true);
			con.setDoInput(true);
			// header 세팅
			con.setRequestProperty("Content-Type", "application/octet-stream");
            con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
            con.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
			
            OutputStream outputStream = con.getOutputStream();
            
            File voiceFile = new File("c:\\temp\\sample.wav");
            FileInputStream inputStream = new FileInputStream(voiceFile);
            
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            
            while( (bytesRead = inputStream.read(buffer)) != -1) {
            	// buffer의 0번에서부터 bytesRead 읽은 곳 까지!
            	outputStream.write(buffer, 0, bytesRead);
            }
            // 차는대로 바로바로 전송 = flush
            outputStream.flush();
            inputStream.close();
            //---------------------------- 음성파일 전송 완료
			
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String oneLine = "";
			StringBuilder sum = new StringBuilder();
			
			while((oneLine = br.readLine()) != null) {
				sum.append(oneLine);
			}
			
			System.out.println(sum.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(br != null) br.close();
					if(dos != null) dos.close();
				} catch (IOException e) {
				}
		}
	}

}
