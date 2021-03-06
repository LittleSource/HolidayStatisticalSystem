package com.ymkj.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import net.sf.json.JSONObject;

public class GetSMS {
	public static final String ACCOUNT_SID = "af47a0b18a184fa09128df1fed9e65bc";//这里填写你在平台里的ACOUNT_SID

    /**
     * 密钥
     */

    public static final String AUTH_TOKEN = "7b5d1d17a1c74507b0a8782ea43a5c33";
    /**
     * 请求地址前半部分
     */    
    public static final String BASE_URL = "https://api.miaodiyun.com/20150822/industrySMS/sendSMS";
    
    /**
     * 随机码
     */
    
    public static String randNum=RandUtil.getRandomNum();
    
    //【浩创空间】必须与短信签名一致
    public static String smsContent = "【浩创空间】您的验证码为" + randNum +  "，请于" + 2 + "分钟内正确输入，如非本人操作，请忽略此短信。";
    
    /**
     * 获取验证码
     *
     * @param to
     * @return
     */
    
    public static void getmMssage(String to) {
        String args = SendNumUtil.queryArgs(ACCOUNT_SID, AUTH_TOKEN,smsContent,to);
        OutputStreamWriter out = null;
        InputStream in = null;
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL(BASE_URL);
            URLConnection connection = url.openConnection();//打开连接
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setConnectTimeout(5000);  //设置链接超时
            connection.setReadTimeout(10000);    //设置读取超时
            out = new OutputStreamWriter(connection.getOutputStream(),"utf-8");
            out.write(args);
            out.flush();
            //读取返回数据
            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            while((line = br.readLine())!=null){
                sb.append(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        JSONObject jsonObject = JSONObject.fromObject(sb.toString());
        Object object = jsonObject.get("respCode");
        System.out.println("状态码："+object+"验证码："+randNum);
        /* 
        if (!object.equals("00000")) {
            return object.toString();
        }else{
            return "发送成功！";
       }
       */
    }
    


}
