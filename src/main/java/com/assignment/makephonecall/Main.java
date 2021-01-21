package com.assignment.makephonecall;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;

public class Main {
    public static void main(String[] args) {
        MakePhoneCall phoneCall = new MakePhoneCall();
        Twilio.init(phoneCall.getACC_SID(), phoneCall.getAUTH_TOKEN());

        // Phone numbers should be in E.164 format
        // more info: https://www.twilio.com/docs/glossary/what-e164
        String from = "+12013409432";
        String to   = "55618061";

        try {
            Call call = Call.creator(
                    new PhoneNumber(to),
                    new PhoneNumber(from),
                    new URI("http://demo.twilio.com/docs/voice.xml")).create();
            // printing account SID to confirm, that phone call succeeded
            System.out.printf("Status: %s\nAccount SID: %s\n",
                    call.getStatus(), call.getAccountSid());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
