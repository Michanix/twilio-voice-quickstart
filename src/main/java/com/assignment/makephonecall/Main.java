package com.assignment.makephonecall;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        MakePhoneCall phoneCall = new MakePhoneCall();
        Twilio.init(phoneCall.getACC_SID(), phoneCall.getAUTH_TOKEN());

        // Phone numbers should be in E.164 format
        // more info: https://www.twilio.com/docs/glossary/what-e164
        String from = "+12013409432";
        String to = "+37255618061";

        Call call = Call.creator(
                new PhoneNumber(to),
                new PhoneNumber(from),
                new URI("http://demo.twilio.com/docs/voice.xml")).create();
        // printing account SID to confirm, that phone call succeeded
        System.out.println(call.getAccountSid());
    }
}
