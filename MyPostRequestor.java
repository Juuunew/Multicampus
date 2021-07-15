package test0;

import java.io.*;
import java.net.*;

public class MyPostRequestor {

	public static void main(String[] args) {
		
		DataOutputStream dos = null;
		BufferedReader br = null;
		
		try {
			String apiURL = "http://localhost:8090/login.jes";
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			// get or post 지정
			con.setRequestMethod("POST");
			con.setDoOutput(true);
			
			dos = new DataOutputStream(con.getOutputStream());
			// 동적 파라미터
			String params = "id=" + args[0] + "&pw=" + args[1];
			dos.writeBytes(params);
			
//			con.setDoInput(true);
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String oneLine = "";
			String sum = "";
			
			while((oneLine = br.readLine()) != null) {
				sum += oneLine;
			}
			
			System.out.println(sum);
			
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
