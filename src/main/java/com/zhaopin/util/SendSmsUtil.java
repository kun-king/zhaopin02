package com.zhaopin.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description:    短信发送工具
 * @Author:         Joe
 * @CreateDate:     2020/3/21 15:49
 */
@Service
public class SendSmsUtil {

    @Value("${alisms.accessKeyId}")
    private String accessKeyId;// = "LTAI4FyCWPw7Wh2A3e";
    @Value("${alisms.accessSecret}")
    private String accessSecret;//= "cXXLTMgxzZOmaRAPkMT";
    @Value("${alisms.signName}")
    private String signName;//= "光明前程招聘网";
    @Value("${alisms.templateCode}")
    private String templateCode;// = "SMS_189620943";


    public String aliSendSms(String PhoneNumbers,String TemplateParam){
        String result = "";
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", PhoneNumbers);
        request.putQueryParameter("SignName", signName);
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", TemplateParam);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            String infojson = response.getData();
            Gson gson2 = new Gson();
            Map map = gson2.fromJson(infojson, Map.class);
            String codes = map.get("Message").toString();
            System.out.println("codes="+codes);
            if(codes.equals("OK")){
                result="ok";
            }else {
                result="not_ok";
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        System.out.println("result="+result);
        return result;
    }

}

