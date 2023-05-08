trigger ExternalSystemIntegration on Account (before insert, before update) 
{
    //List of NSDL System for PAN Integration
    List<String> panList = new List<String>();
    for(Account a : Trigger.new)
    {
        if(a.PAN_Number__c != null)
        {
            String panNumber = a.PAN_Number__c;
            panList.add(panNumber);
        }
    }
    //Send Requests to NSDL System
    if(panList.size() > 0)
    {
        HttpRequest req = new HttpRequest();
        req.setEndpoint('callout:NSDL_Integration/verifyPAN');
        req.setMethod('POST');
        req.setHeader('Content-Type', 'application/json');
        req.setBody('{"PANList" : '+JSON.serialize(panList)+'}');
        Http http = new Http();
        HttpResponse res = http.send(req);
        //Handle Response from NSDL System
        if(res.getStatusCode() == 200)
        {
            Map<String, Object> responseMap = (Map<String, Object>)JSON.deserializeUntyped(res.getBody());
            Map<String, Object> panDetailsMap = (Map<String, Object>)responseMap.get('PANDetails');
            for(Account a : Trigger.new)
            {
                if(panDetailsMap.containsKey(a.PAN_Number__c))
                {
                    Map<String, Object> panDetail = (Map<String, Object>)panDetailsMap.get(a.PAN_Number__c);
                    a.PAN_Name__c = (String)panDetail.get('Name');
                    a.PAN_Status__c = (String)panDetail.get('Status');
                }
            }
        }
    }
    
    //List of API Integration with E-Feap System
    List<String> feapList = new List<String>();
    for(Account a : Trigger.new)
    {
        if(a.Feap_Channel_ID__c != null)
        {
            String feapID = a.Feap_Channel_ID__c;
            feapList.add(feapID);
        }
    }
    //Send Requests to E-Feap System
    if(feapList.size() > 0)
    {
        HttpRequest req = new HttpRequest();
        req.setEndpoint('callout:E_Feap_Integration/getCommissionPayment');
        req.setMethod('POST');
        req.setHeader('Content-Type', 'application/json');
        req.setBody('{"FeapList" : '+JSON.serialize(feapList)+'}');
        Http http = new Http();
        HttpResponse res = http.send(req);
        //Handle Response from E-Feap System
        if(res.getStatusCode() == 200)
        {
            Map<String, Object> responseMap = (Map<String, Object>)JSON.deserializeUntyped(res.getBody());
            Map<String, Object> commissionMap = (Map<String, Object>)responseMap.get('CommissionDetails');
            for(Account a : Trigger.new)
            {
                if(commissionMap.containsKey(a.Feap_Channel_ID__c))
                {
                    Map<String, Object> commissionDetail = (Map<String, Object>)commissionMap.get(a.Feap_Channel_ID__c);
                    a.Commission_Amount__c = (Decimal)commissionDetail.get('Amount');
                    a.Channel_Manager__c = (String)commissionDetail.get('Manager');
                }
            }
        }
    }
    
    //List of Integration with Bank for NEFT Payment
    List<String> neftList = new List<String>();
    for(Account a : Trigger.new)
    {
        if(a.NEFT_Transaction_ID__c != null)
        {
            String neftID = a.NEFT_Transaction_ID__c;
            neftList.add(neftID);
        }
    }
    //Send Requests to Bank
